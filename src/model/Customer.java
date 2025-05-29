package model;

import java.time.LocalDateTime;

public class Customer {
    private int customerId;
    private String name;
    private String phone;
    private String address;
    private LocalDateTime createdAt;
    private int loyaltyPoints;
    private LocalDateTime lastPurchaseDate;
    private String notes;
    private boolean marketingOptIn;

    // Constructor
    public Customer(int customerId, String name, String phone, String address, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.loyaltyPoints = 0;
        this.lastPurchaseDate = null;
        this.notes = "";
        this.marketingOptIn = false;
    }

    // Getters and Setters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
    public LocalDateTime getLastPurchaseDate() { return lastPurchaseDate; }
    public void setLastPurchaseDate(LocalDateTime lastPurchaseDate) { this.lastPurchaseDate = lastPurchaseDate; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
    public boolean isMarketingOptIn() { return marketingOptIn; }
    public void setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; }
}