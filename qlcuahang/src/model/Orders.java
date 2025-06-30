package model;

import java.time.LocalDateTime;

public class Orders {
    private int orderId;
    private int customerId;
    private LocalDateTime orderDate; // Ngay dat hang
    private LocalDateTime pickupDate; // Ngay nhan hang
    private String status; // Trang thai don hang (pending, completed, cancelled)
    private double deposit; // Tien dat coc
    private double totalPrice; // Tong tien thanh toan
    

    // Constructor
    public Orders(int orderId, int customerId, LocalDateTime orderDate, LocalDateTime pickupDate, String status, double deposit) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.pickupDate = pickupDate;
        this.status = status;
        this.deposit = deposit;
        this.totalPrice = 0.0;
        
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

}