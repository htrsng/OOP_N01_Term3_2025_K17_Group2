package manager;

import model.Customer;
import java.util.ArrayList;

public class CustomerManager {
    ArrayList<Customer> customers = new ArrayList<>();

    // Them khach hang
    public ArrayList<Customer> addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Da them khach hang: " + customer.getFullname());
        return customers;
    }

    // Sua thong tin khach hang
    public void editCustomer(int customerId, String fullname, String phone, String address) {
        for (Customer c : customers) {
            if (c.getCustomerId() == customerId) {
                c.setFullname(fullname);
                c.setPhone(phone);
                c.setAddress(address);
                System.out.println("Da sua thong tin khach hang co ID: " + customerId);
                return;
            }
        }
        System.out.println("Khong tim thay khach hang co ID: " + customerId);
    }

    // Xoa khach hang
    public void deleteCustomer(int customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerId() == customerId) {
                customers.remove(i);
                System.out.println("Da xoa khach hang co ID: " + customerId);
                return;
            }
        }
        System.out.println("Khong tim thay khach hang co ID: " + customerId);
    }

    // In danh sach khach hang
    public void printCustomerList() {
        if (customers.isEmpty()) {
            System.out.println("Khong co khach hang nao.");
        }
        for (Customer c : customers) {
            System.out.println("ID: " + c.getCustomerId() +
                               ", Ten: " + c.getFullname() +
                               ", SDT: " + c.getPhone() +
                               ", Dia chi: " + c.getAddress());
        }
    }

    // Lay danh sach khach hang
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}