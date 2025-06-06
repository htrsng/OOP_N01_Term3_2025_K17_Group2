package model;

import java.time.LocalDateTime;

public class Customer {
    private int customerId;
    private String fullname;
    private String phone;
    private String address;
    private LocalDateTime createdAt; // Ngay tao tai khoan
    private int loyaltyPoints; // Diem thuong
    private LocalDateTime lastPurchaseDate; // Ngay mua hang cuoi
   

    // Constructor
    public Customer(int customerId, String fullname, String phone, String address, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.fullname = fullname;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.loyaltyPoints = 0;
        this.lastPurchaseDate = null;
       
    }

    // Getter va Setter
    public int getCustomerId() {
        return customerId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public LocalDateTime getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(LocalDateTime lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    
}