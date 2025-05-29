package manager;

import model.Customer;

import java.time.LocalDateTime;
import java.util.*;

public class CustomerManager {
    private List<Customer> customers = new ArrayList<>();

    // Thêm khách hàng mới
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Lấy tất cả khách hàng
    public List<Customer> getAllCustomers() {
        return customers;
    }

    // Tìm khách hàng theo ID
    public Customer findById(int id) {
        for (Customer c : customers) {
            if (c.getCustomerId() == id) return c;
        }
        return null;
    }

    // Cập nhật thông tin khách hàng
    public boolean updateCustomer(int id, String newName, String newPhone, String newAddress) {
        Customer customer = findById(id);
        if (customer != null) {
            customer.setName(newName);
            customer.setPhone(newPhone);
            customer.setAddress(newAddress);
            return true;
        }
        return false;
    }

    // Xoá khách hàng
    public boolean deleteCustomer(int id) {
        return customers.removeIf(c -> c.getCustomerId() == id);
    }

    // Cập nhật điểm tích lũy
    public boolean addLoyaltyPoints(int id, int points) {
        Customer customer = findById(id);
        if (customer != null) {
            customer.setLoyaltyPoints(customer.getLoyaltyPoints() + points);
            customer.setLastPurchaseDate(LocalDateTime.now());
            return true;
        }
        return false;
    }

    // Hiển thị đơn giản
    public void displayAll() {
        for (Customer c : customers) {
            System.out.printf("ID: %d | Tên: %s | SĐT: %s | Điểm: %d\n",
                    c.getCustomerId(), c.getName(), c.getPhone(), c.getLoyaltyPoints());
        }
    }
}
