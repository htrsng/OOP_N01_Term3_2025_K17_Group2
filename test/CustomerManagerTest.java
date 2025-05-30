import manager.CustomerManager;
import model.Customer;

import java.time.LocalDateTime;

public class CustomerManagerTest {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Them khach hang
        manager.addCustomer(new Customer(1, "Nguyen Van A", "0901234567", "Ha Noi", LocalDateTime.now()));
        manager.addCustomer(new Customer(2, "Tran Thi B", "0912345678", "TP.HCM", LocalDateTime.now()));

    }
}
