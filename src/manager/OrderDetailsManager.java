package manager;

import model.OrderDetails;
import java.util.ArrayList;

public class OrderDetailsManager {
    ArrayList<OrderDetails> orderDetails = new ArrayList<>();

    public ArrayList<OrderDetails> addOrderDetails(OrderDetails orderDetail) {
        orderDetails.add(orderDetail);
        System.out.println("da them " + orderDetail.getOrderId());
        return orderDetails;
    }

    public ArrayList<OrderDetails> getEditOrderDetails(int quantity, int orderId) {
        for (int i = 0; i < orderDetails.size(); i++) {
            if (orderDetails.get(i).getOrderId() == orderId) {
                System.out.println("true");
                orderDetails.get(i).setQuantity(quantity);
            }
        }
        return orderDetails;
    }

    public ArrayList<OrderDetails> getDeleteOrderDetails(int orderId) {
        for (int i = 0; i < orderDetails.size(); i++) {
            if (orderDetails.get(i).getOrderId() == orderId) {
                orderDetails.remove(i);
            }
        }
        return orderDetails;
    }

    public void printOrderDetailsList() {
        int len = orderDetails.size();
        for (int i = 0; i < len; i++) {
            System.out.println("Order ID: " + orderDetails.get(i).getOrderId() + 
                             ", Car ID: " + orderDetails.get(i).getCarId() + 
                             ", Quantity: " + orderDetails.get(i).getQuantity());
        }
    }
}