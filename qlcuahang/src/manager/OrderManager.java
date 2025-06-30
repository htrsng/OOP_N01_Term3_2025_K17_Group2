package manager;

import model.Orders;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Orders> orders = new ArrayList<>();

    // Them don hang moi
    public void addOrder(Orders order) {
        if (order == null) {
            System.out.println("Don hang khong duoc null.");
            return;
        }
        orders.add(order);
        System.out.println("Da them don hang ID: " + order.getOrderId());
    }

    // Sua don hang dua vao orderId
    public void updateOrder(int orderId, String status, double deposit) {
        for (Orders order : orders) {
            if (order.getOrderId() == orderId) {
                order.setStatus(status);
                order.setDeposit(deposit);
                System.out.println("Da cap nhat don hang ID: " + orderId);
                return;
            }
        }
        System.out.println("Khong tim thay don hang ID: " + orderId);
    }

    // Xoa don hang dua vao orderId
    public void deleteOrder(int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == orderId) {
                orders.remove(i);
                System.out.println("Da xoa don hang ID: " + orderId);
                return;
            }
        }
        System.out.println("Khong tim thay don hang ID: " + orderId);
    }

    // In danh sach don hang
    public void printOrderList() {
        if (orders.isEmpty()) {
            System.out.println("Danh sach don hang trong.");
            return;
        }
        for (Orders order : orders) {
            System.out.println("Order ID: " + order.getOrderId() +
                               ", Customer ID: " + order.getCustomerId() +
                               ", Status: " + order.getStatus() +
                               ", Deposit: " + order.getDeposit());
        }
    }

    // Hien thi danh sach don hang da hoan thanh
    public void printCompletedOrders() {
        boolean found = false;
        System.out.println("Danh sach don hang da hoan thanh:");
        for (Orders order : orders) {
            if ("hoanthanh".equalsIgnoreCase(order.getStatus()) || "da hoan thanh".equalsIgnoreCase(order.getStatus())) {
                System.out.println("Order ID: " + order.getOrderId() +
                                   ", Customer ID: " + order.getCustomerId() +
                                   ", Status: " + order.getStatus() +
                                   ", Deposit: " + order.getDeposit());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co don hang nao da hoan thanh.");
        }
    }

    // Lay danh sach don hang
    public ArrayList<Orders> getOrders() {
        return orders;
    }
    // Tao don hang moi
    public void createOrderWithDeposit(int orderId, int customerId, String carId, double deposit) {
        LocalDateTime now = LocalDateTime.now(); 
        Orders order = new Orders(orderId, customerId, now, null, "pending", deposit);
        orders.add(order);
        System.out.println("Da tao don hang moi voi ID: " + orderId + ", Customer ID: " + customerId + ", Deposit: " + deposit);
    }

    // Tim kiem don hang theo orderId
    public Orders findOrderById(int orderId) {
        for (Orders order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }
    
}