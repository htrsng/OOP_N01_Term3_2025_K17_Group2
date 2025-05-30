package manager;

import model.Orders;
import java.util.ArrayList;

public class OrderManager {
    ArrayList<Orders> orders = new ArrayList<>();

    // Them don hang
    public ArrayList<Orders> addOrder(Orders order) {
        orders.add(order);
        System.out.println("Da them don hang: " + order.getOrderId());
        return orders;
    }

    // Sua don hang (vi du: sua trang thai)
    public ArrayList<Orders> editOrder(int orderId, String status) {
        for (Orders o : orders) {
            if (o.getOrderId() == orderId) {
                o.setStatus(status);
                System.out.println("Da sua don hang co ID: " + orderId);
            }
        }
        return orders;
    }

    // Xoa don hang
    public ArrayList<Orders> deleteOrder(int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == orderId) {
                orders.remove(i);
                System.out.println("Da xoa don hang co ID: " + orderId);
                break;
            }
        }
        return orders;
    }

    // In danh sach don hang
    public void printOrderList() {
        if (orders.isEmpty()) {
            System.out.println("Khong co don hang nao.");
        }
        for (Orders o : orders) {
            System.out.println("Order ID: " + o.getOrderId() +
                               ", Customer ID: " + o.getCustomerId() +
                               ", Ngay dat: " + o.getOrderDate() +
                               ", Trang thai: " + o.getStatus());
        }
    }

    // Lay danh sach don hang
    public ArrayList<Orders> getOrders() {
        return orders;
    }
}