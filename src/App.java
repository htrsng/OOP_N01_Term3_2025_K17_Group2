import model.Customer;
import manager.CustomerManager;

import java.time.LocalDateTime;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 1. Tao doi tuong CustomerManager
        CustomerManager customerManager = new CustomerManager();

        // 2. Them khach hang moi
        LocalDateTime now = LocalDateTime.now();
        Customer customer1 = new Customer(1, "Nguyen Van A", "0123456789", "Hanoi", now);
        customerManager.addCustomer(customer1);

        // 3. Hien thi danh sach khach hang
        System.out.println("Danh sach khach hang sau khi them");
        printCustomers(customerManager.getAllCustomers());

        // 4. Cap nhat khach hang
        customer1.setAddress("Ha Noi - Updated");
        customerManager.updateCustomer(
            customer1.getCustomerId(),
            customer1.getName(),
            customer1.getPhone(),
            customer1.getAddress()
        );

        System.out.println(" Danh sach khach hang sau khi cap nhat");
        printCustomers(customerManager.getAllCustomers());

        // 5. Xoa khach hang
        customerManager.deleteCustomer(1);

        System.out.println("Danh sach khach hang sau khi xoa");
        printCustomers(customerManager.getAllCustomers());
    }

    // Ham tien ich de in danh sach
    private static void printCustomers(List<Customer> customers) {
        if (customers.isEmpty()) {
            System.out.println("Khong co khach hang nao.");
        }
        for (Customer c : customers) {
            System.out.println("ID: " + c.getCustomerId() +
                               ", Ten: " + c.getName() +
                               ", SDT: " + c.getPhone() +
                               ", Dia chi: " + c.getAddress());
        }
    }
}
