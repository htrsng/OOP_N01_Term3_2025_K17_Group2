package model;
import java.time.LocalDateTime;

public class Car {
    private String carId;
    private String carName;
    private String brand; //hang
    private double price;//gia
    private int quantity; // so luong
    private String status;  //trang thai
    private LocalDateTime createdAt; // Ngay tao xe
    private LocalDateTime updatedAt; // Ngay cap nhat xe
    

    // Constructor
    public Car(String carId, String carName, String brand, double price, int quantity, String status) {
        this.carId = carId;
        this.carName = carName;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.createdAt = LocalDateTime.now(); // Set createdAt to current time
        this.updatedAt = LocalDateTime.now(); // Set updatedAt to current time
        
    }

    // Getters and Setters
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    

    
}