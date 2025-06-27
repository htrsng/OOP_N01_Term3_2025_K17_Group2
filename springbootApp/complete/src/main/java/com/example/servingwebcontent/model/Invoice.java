package com.example.servingwebcontent.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    private String invoiceId;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car; // Thay carId bằng mối quan hệ với Car

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Date date;
    private double totalAmount;

    public Invoice() {}

    public Invoice(String invoiceId, Customer customer, Car car, double totalAmount) {
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative!");
        }
        this.invoiceId = invoiceId;
        this.customer = customer;
        this.car = car;
        this.date = new Date();
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public String getInvoiceId() { return invoiceId; }
    public void setInvoiceId(String invoiceId) { this.invoiceId = invoiceId; }
    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public Date getDate() { return date; }
    public void setDate(Date date) {
        if (date == null || date.after(new Date())) {
            throw new IllegalArgumentException("Date must be in the past or present!");
        }
        this.date = date;
    }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) {
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative!");
        }
        this.totalAmount = totalAmount;
    }

    public String getCustomerId() {
        return customer != null ? customer.getCustomerId() : null; // Giả định Customer có getCustomerId()
    }

    public String getCarId() {
        return car != null ? car.getCarId() : null; // Giả định Car có getCarId()
    }

    // Phương thức nghiệp vụ
    public boolean isValid() {
        return customer != null && car != null && totalAmount >= 0 && date != null;
    }

    public void updateTotalAmount(double newAmount) {
        if (newAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative!");
        }
        this.totalAmount = newAmount;
        if (car != null) {
            car.setStatus("Sold"); // Cập nhật trạng thái xe khi hóa đơn được cập nhật
        }
    }

    public String getInvoiceDetails() {
        return "Invoice ID: " + invoiceId +
               ", Customer ID: " + (customer != null ? customer.getCustomerId() : "N/A") +
               ", Car ID: " + (car != null ? car.getCarId() : "N/A") +
               ", Date: " + (date != null ? date : "N/A") +
               ", Total: " + totalAmount + " VND";
    }
}