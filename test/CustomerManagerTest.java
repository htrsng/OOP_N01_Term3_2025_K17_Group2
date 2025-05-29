import manager.CustomerManager;
import model.Customer;

import java.time.LocalDateTime;

public class CustomerManagerTest {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Them khach hang
        manager.addCustomer(new Customer(1, "Nguyen Van A", "0901234567", "Ha Noi", LocalDateTime.now()));
        manager.addCustomer(new Customer(2, "Tran Thi B", "0912345678", "TP.HCM", LocalDateTime.now()));

        // Hien thi tat ca khach hang
        System.out.println(" Danh sach khach hang");
        manager.displayAll();

        // Cap nhat thong tin
        manager.updateCustomer(1, "Nguyen Van A Updated", "0900000000", "Da Nang");

        // Cong diem tich luy
        manager.addLoyaltyPoints(1, 50);

        // In lai sau cap nhat
        System.out.println("Sau cap nhat");
        manager.displayAll();

        // Xoa khach hang
        manager.deleteCustomer(2);

        // In lai sau xoa
        System.out.println("Sau khi xoa");
        manager.displayAll();
    }
}
