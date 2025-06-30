package manager;

import model.OrderDetails;
import java.util.ArrayList;

public class OrderDetailsManager {
    ArrayList<OrderDetails> orderDetailsList = new ArrayList<>();

    // Them chi tiet don hang
    public ArrayList<OrderDetails> addOrderDetails(OrderDetails orderDetail) {
        orderDetailsList.add(orderDetail);
        System.out.println("Da them chi tiet don hang voi Order ID: " + orderDetail.getOrderId());
        return orderDetailsList;
    }

    // Sua so luong cua chi tiet don hang theo orderId
    public void editOrderDetails(int orderId, int newQuantity) {
        for (OrderDetails od : orderDetailsList) {
            if (od.getOrderId() == orderId) {
                od.setQuantity(newQuantity);
                System.out.println("Da sua so luong cho Order ID: " + orderId);
                return;
            }
        }
        System.out.println("Khong tim thay chi tiet don hang co Order ID: " + orderId);
    }

    // Xoa chi tiet don hang theo orderId
    public void deleteOrderDetails(int orderId) {
        for (int i = 0; i < orderDetailsList.size(); i++) {
            if (orderDetailsList.get(i).getOrderId() == orderId) {
                orderDetailsList.remove(i);
                System.out.println("Da xoa chi tiet don hang co Order ID: " + orderId);
                return;
            }
        }
        System.out.println("Khong tim thay chi tiet don hang co Order ID: " + orderId);
    }

    
    // In danh sach chi tiet don hang
    public void printOrderDetailsList() {
        if (orderDetailsList.isEmpty()) {
            System.out.println("Khong co chi tiet don hang nao.");
        }
        for (OrderDetails od : orderDetailsList) {
            System.out.println("Order ID: " + od.getOrderId() +
                               ", Car ID: " + od.getCarId() +
                               ", Quantity: " + od.getQuantity());
        }
    }
     
    // Lay danh sach chi tiet don hang
    public ArrayList<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }
}