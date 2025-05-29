package model;

import java.time.LocalDateTime;

public class Car {
    private int carId;
    private String carName;
    private String brand;
    private double price;
    private int quantity;
    private String status;
    private String description;
    private String imageUrl;
    private int warrantyPeriod;
    private LocalDateTime lastMaintenance;
    private String category;

    // Constructor
    public Car(int carId, String carName, String brand, double price, int quantity, String status) {
        this.carId = carId;
        this.carName = carName;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.description = "";
        this.imageUrl = "";
        this.warrantyPeriod = 0;
        this.lastMaintenance = null;
        this.category = "";
    }

    // Getters and Setters
    public int getCarId() { return carId; }
    public void setCarId(int carId) { this.carId = carId; }
    public String getCarName() { return carName; }
    public void setCarName(String carName) { this.carName = carName; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public int getWarrantyPeriod() { return warrantyPeriod; }
    public void setWarrantyPeriod(int warrantyPeriod) { this.warrantyPeriod = warrantyPeriod; }
    public LocalDateTime getLastMaintenance() { return lastMaintenance; }
    public void setLastMaintenance(LocalDateTime lastMaintenance) { this.lastMaintenance = lastMaintenance; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}