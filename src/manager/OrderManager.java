package manager;

import model.Orders;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class OrderManager {
    ArrayList<Orders> orders = new ArrayList<>();

    public ArrayList<Orders> addOrder(Orders order) {
        orders.add(order);
        System.out.println("Đã thêm đơn hàng ID: " + order.getOrderId());
        return orders;
    }

    public ArrayList<Orders> getEditOrder(String status, int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == orderId) {
                System.out.println("true");
                orders.get(i).setStatus(status);
            }
        }
        return orders;
    }

    public ArrayList<Orders> getDeleteOrder(int orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == orderId) {
                orders.remove(i);
            }
        }
        return orders;
    }

    public void printOrderList() {
        int len = orders.size();
        for (int i = 0; i < len; i++) {
            System.out.println("Order ID: " + orders.get(i).getOrderId() + 
                             ", Customer ID: " + orders.get(i).getCustomerId() + 
                             ", Status: " + orders.get(i).getStatus());
        }
    }
}