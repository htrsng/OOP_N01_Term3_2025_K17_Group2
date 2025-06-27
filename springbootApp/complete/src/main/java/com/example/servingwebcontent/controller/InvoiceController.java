package com.example.servingwebcontent.controller;

  import com.example.servingwebcontent.model.Invoice;
  import com.example.servingwebcontent.model.Customer;
  import com.example.servingwebcontent.model.Car;
  import com.example.servingwebcontent.service.CarList;
  import com.example.servingwebcontent.service.CustomerList;
  import com.example.servingwebcontent.service.InvoiceList;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Controller;
  import org.springframework.ui.Model;
  import org.springframework.web.bind.annotation.*;
  import org.springframework.web.servlet.mvc.support.RedirectAttributes;

  @Controller
  public class InvoiceController {
      private final InvoiceList invoiceList;
      private final CustomerList customerList;
      private final CarList carList;

      @Autowired
      public InvoiceController(InvoiceList invoiceList, CustomerList customerList, CarList carList) {
          this.invoiceList = invoiceList;
          this.customerList = customerList;
          this.carList = carList;
      }

      @GetMapping("/create-invoice")
      public String showCreateInvoiceForm(Model model) {
          model.addAttribute("customers", customerList.getAllCustomers());
          model.addAttribute("cars", carList.getAvailableCars()); // Sử dụng getAvailableCars
          return "invoice/create-invoice";
      }

      @PostMapping("/create-invoice")
      public String createInvoice(@RequestParam String invoiceId,
                                 @RequestParam String customerId,
                                 @RequestParam String carId,
                                 RedirectAttributes redirectAttributes) {
          if (invoiceId == null || invoiceId.trim().isEmpty() ||
              customerId == null || customerId.trim().isEmpty() ||
              carId == null || carId.trim().isEmpty()) {
              redirectAttributes.addFlashAttribute("error", "All fields are required!");
              return "redirect:/create-invoice";
          }
          try {
              invoiceList.createInvoice(invoiceId, customerId, carId);
              redirectAttributes.addFlashAttribute("message", "Invoice created successfully!");
          } catch (IllegalArgumentException | IllegalStateException e) {
              redirectAttributes.addFlashAttribute("error", e.getMessage());
          }
          return "redirect:/create-invoice";
      }

      @GetMapping("/invoices")
      public String showInvoices(Model model) {
          model.addAttribute("invoices", invoiceList.getAllInvoices());
          return "invoice/invoice-list";
      }

      @GetMapping("/invoices/delete/{invoiceId}")
      public String deleteInvoice(@PathVariable String invoiceId, RedirectAttributes redirectAttributes) {
          if (invoiceId == null || invoiceId.trim().isEmpty()) {
              redirectAttributes.addFlashAttribute("error", "Invoice ID cannot be null or empty!");
              return "redirect:/invoices";
          }
          try {
              invoiceList.deleteInvoice(invoiceId);
              redirectAttributes.addFlashAttribute("message", "Invoice deleted successfully!");
          } catch (Exception e) {
              redirectAttributes.addFlashAttribute("error", e.getMessage());
          }
          return "redirect:/invoices";
      }

      @GetMapping("/invoices/edit/{invoiceId}")
      public String showEditInvoiceForm(@PathVariable String invoiceId, Model model) {
          Invoice invoice = invoiceList.findInvoice(invoiceId);
          if (invoice == null) {
              return "redirect:/invoices";
          }
          model.addAttribute("invoice", invoice);
          model.addAttribute("customers", customerList.getAllCustomers());
          model.addAttribute("cars", carList.getAvailableCars());
          return "invoice/edit-invoice";
      }

      @PostMapping("/invoices/edit")
      public String editInvoice(@RequestParam String invoiceId,
                              @RequestParam String customerId,
                              @RequestParam String carId,
                              @RequestParam double totalAmount,
                              RedirectAttributes redirectAttributes) {
          Customer customer = customerList.findCustomer(customerId);
          Car car = carList.findCar(carId);
          if (customer == null || car == null) {
              redirectAttributes.addFlashAttribute("error", "Invalid customer or car!");
              return "redirect:/invoices";
          }
          try {
              invoiceList.updateInvoice(invoiceId, customer, car, totalAmount);
              redirectAttributes.addFlashAttribute("message", "Invoice updated successfully!");
          } catch (Exception e) {
              redirectAttributes.addFlashAttribute("error", e.getMessage());
          }
          return "redirect:/invoices";
      }
  }