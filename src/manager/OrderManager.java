package manager;

import model.Orders;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class OrderManager {
    ArrayList<Orders> orders = new ArrayList<>();

    public ArrayList<Orders> addOrder(Orders order) {
        try {
            if (order == null) {
                throw new IllegalArgumentException("Don hang khong duoc null.");
            }
            orders.add(order);
            System.out.println("Da them don hang ID: " + order.getOrderId());
            return orders;
        } catch (Exception e) {
            System.out.println("Loi khi them don hang: " + e.getMessage());
            return orders;
        }
    }

    public ArrayList<Orders> updateOrder(int orderId, String status, double deposit) {
        try {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getOrderId() == orderId) {
                    orders.get(i).setStatus(status);
                    orders.get(i).setDeposit(deposit);
                    System.out.println("Da cap nhat don hang ID: " + orderId);
                    return orders;
                }
            }
            System.out.println("Khong tim thay don hang ID: " + orderId);
            return orders;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Loi truy cap danh sach: " + e.getMessage());
            return orders;
        } catch (Exception e) {
            System.out.println("Loi khi cap nhat don hang: " + e.getMessage());
            return orders;
        }
    }

    public ArrayList<Orders> deleteOrder(int orderId) {
        try {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getOrderId() == orderId) {
                    orders.remove(i);
                    System.out.println("Da xoa don hang ID: " + orderId);
                    return orders;
                }
            }
            System.out.println("Khong tim thay don hang ID: " + orderId);
            return orders;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Loi truy cap danh sach: " + e.getMessage());
            return orders;
        } catch (Exception e) {
            System.out.println("Loi khi xoa don hang: " + e.getMessage());
            return orders;
        }
    }

    public void printOrderList() {
        try {
            int len = orders.size();
            if (len == 0) {
                System.out.println("Danh sach don hang trong.");
                return;
            }
            for (int i = 0; i < len; i++) {
                System.out.println("Order ID: " + orders.get(i).getOrderId() +
                                 ", Customer ID: " + orders.get(i).getCustomerId() +
                                 ", Status: " + orders.get(i).getStatus() +
                                 ", Deposit: " + orders.get(i).getDeposit());
            }
        } catch (Exception e) {
            System.out.println("Loi khi hien thi danh sach don hang: " + e.getMessage());
        }
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }
}