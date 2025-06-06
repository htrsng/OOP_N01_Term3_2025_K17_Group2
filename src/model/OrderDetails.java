package model;

import java.time.LocalDateTime;

public class OrderDetails {
    private int orderId;
    private int carId;
    private int quantity; // So luong xe
    private double priceEach; // Gia moi xe
    private String deliveryStatus; // Trang thai giao hang
    private LocalDateTime returnDate; // Ngay tra hang
    private String conditionNote; // Ghi chu ve tinh trang xe

    // Constructor
    public OrderDetails(int orderId, int carId, int quantity, double priceEach) {
        this.orderId = orderId;
        this.carId = carId;
        this.quantity = quantity;
        this.priceEach = priceEach;
       
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