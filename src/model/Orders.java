package model;

import java.time.LocalDateTime;

public class Orders {
    private int orderId;
    private int customerId;
    private LocalDateTime orderDate;
    private LocalDateTime pickupDate;
    private String status;
    private double deposit;
    private double totalPrice;
    private String paymentMethod;
    private String paymentStatus;
    private String deliveryAddress;
    private int employeeId;
    private String discountCode;

    // Constructor
    public Orders(int orderId, int customerId, LocalDateTime orderDate, LocalDateTime pickupDate, String status, double deposit) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.pickupDate = pickupDate;
        this.status = status;
        this.deposit = deposit;
        this.totalPrice = 0.0;
        this.paymentMethod = "";
        this.paymentStatus = "unpaid";
        this.deliveryAddress = "";
        this.employeeId = 0;
        this.discountCode = "";
    }

    // Getter va Setter
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
}