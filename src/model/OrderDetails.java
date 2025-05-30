package model;

import java.time.LocalDateTime;

public class OrderDetails {
    private int orderId;
    private int carId;
    private int quantity;
    private double priceEach;
    private double discount;
    private String serialNumber;
    private String deliveryStatus;
    private LocalDateTime returnDate;
    private String conditionNote;

    // Constructor
    public OrderDetails(int orderId, int carId, int quantity, double priceEach) {
        this.orderId = orderId;
        this.carId = carId;
        this.quantity = quantity;
        this.priceEach = priceEach;
        this.discount = 0.0;
        this.serialNumber = "";
        this.deliveryStatus = "pending";
        this.returnDate = null;
        this.conditionNote = "";
    }

    // Getter va Setter
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public String getConditionNote() {
        return conditionNote;
    }

    public void setConditionNote(String conditionNote) {
        this.conditionNote = conditionNote;
    }
}