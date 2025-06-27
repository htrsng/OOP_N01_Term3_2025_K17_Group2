package com.example.servingwebcontent.service;

import com.example.servingwebcontent.model.Car;
import com.example.servingwebcontent.model.Customer;
import com.example.servingwebcontent.model.Invoice;
import com.example.servingwebcontent.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceList {
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private CarList carList;
    @Autowired
    private CustomerList customerList;

    public void createInvoice(String invoiceId, String customerId, String carId) {
        if (invoiceId == null || invoiceId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invoice ID cannot be null or empty!");
        }
        if (invoiceRepository.existsById(invoiceId)) {
            throw new IllegalArgumentException("Invoice ID " + invoiceId + " already exists!");
        }
        Customer customer = customerList.findCustomer(customerId);
        if (customer == null) {
            throw new IllegalArgumentException("Customer with ID " + customerId + " not found!");
        }
        Car car = carList.findCar(carId);
        if (car == null) {
            throw new IllegalArgumentException("Car with ID " + carId + " not found!");
        }
        if (car.getStatus().equals("Sold")) {
            throw new IllegalStateException("Car with ID " + carId + " is already sold!");
        }
        double totalAmount = car.getPrice();
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative!");
        }
        Invoice invoice = new Invoice(invoiceId, customer, car, totalAmount);
        invoiceRepository.save(invoice);
        customer.addPurchase(invoice);
        car.sellCar();
        // Cập nhật Customer và Car
        customerList.updateCustomer(
            customer.getCustomerId(),
            customer.getName(),
            customer.getEmail(),
            customer.getPhoneNumber(),
            customer.getAddress()
        );
        carList.updateCar(
            car.getCarId(),
            car.getBrand(),
            car.getModel(),
            car.getYear(),
            car.getPrice(),
            car.getStatus(),
            car.getImportDate()
        );
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public void deleteInvoice(String invoiceId) {
        if (invoiceId == null || invoiceId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invoice ID cannot be null or empty!");
        }
        Optional<Invoice> invoiceOpt = invoiceRepository.findById(invoiceId);
        if (invoiceOpt.isEmpty()) {
            throw new IllegalArgumentException("Invoice with ID " + invoiceId + " not found!");
        }
        Invoice invoice = invoiceOpt.get();
        Customer customer = customerList.findCustomer(invoice.getCustomerId());
        if (customer != null) {
            customer.deletePurchase(invoiceId);
            customerList.updateCustomer(
                customer.getCustomerId(),
                customer.getName(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getAddress()
            );
        }
        Car car = carList.findCar(invoice.getCarId());
        if (car != null) {
            car.setStatus("Available");
            carList.updateCar(
                car.getCarId(),
                car.getBrand(),
                car.getModel(),
                car.getYear(),
                car.getPrice(),
                car.getStatus(),
                car.getImportDate()
            );
        }
        invoiceRepository.deleteById(invoiceId);
    }

    public Invoice findInvoice(String invoiceId) {
        if (invoiceId == null || invoiceId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invoice ID cannot be null or empty!");
        }
        Optional<Invoice> invoiceOpt = invoiceRepository.findById(invoiceId);
        return invoiceOpt.orElse(null);
    }

    public void updateInvoice(String invoiceId, Customer customer, Car car, double totalAmount) {
        if (invoiceId == null || invoiceId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invoice ID cannot be null or empty!");
        }
        Optional<Invoice> invoiceOpt = invoiceRepository.findById(invoiceId);
        if (invoiceOpt.isEmpty()) {
            throw new IllegalArgumentException("Invoice with ID " + invoiceId + " not found!");
        }
        Invoice invoice = invoiceOpt.get();
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative!");
        }
        invoice.setCustomer(customer);
        invoice.setCar(car);
        invoice.updateTotalAmount(totalAmount);
        invoiceRepository.save(invoice);
        // Cập nhật Customer và Car nếu cần
        if (customer != null) {
            customerList.updateCustomer(
                customer.getCustomerId(),
                customer.getName(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getAddress()
            );
        }
        if (car != null && !car.getStatus().equals("Sold")) {
            car.sellCar();
            carList.updateCar(
                car.getCarId(),
                car.getBrand(),
                car.getModel(),
                car.getYear(),
                car.getPrice(),
                car.getStatus(),
                car.getImportDate()
            );
        }
    }

    public List<Invoice> getInvoicesByDateRange(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start date and end date cannot be null!");
        }
        if (startDate.after(endDate)) {
            throw new IllegalArgumentException("Start date cannot be after end date!");
        }
        return invoiceRepository.findByDateRange(startDate, endDate);
    }
}