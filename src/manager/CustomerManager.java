package manager;

import model.Customer;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class CustomerManager {
    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> addCustomer(Customer customer) {
        try {
            if (customer == null) {
                throw new IllegalArgumentException("Khach hang khong duoc null.");
            }
            customers.add(customer);
            System.out.println("Da them khach hang: " + customer.getFullname());
            return customers;
        } catch (Exception e) {
            System.out.println("Loi khi them khach hang: " + e.getMessage());
            return customers;
        }
    }

    public ArrayList<Customer> updateCustomer(int customerId, String fullname, String phone, String address) {
        try {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getCustomerId() == customerId) {
                    customers.get(i).setFullname(fullname);
                    customers.get(i).setPhone(phone);
                    customers.get(i).setAddress(address);
                    System.out.println("Da cap nhat khach hang ID: " + customerId);
                    return customers;
                }
            }
            System.out.println("Khong tim thay khach hang ID: " + customerId);
            return customers;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Loi truy cap danh sach: " + e.getMessage());
            return customers;
        } catch (Exception e) {
            System.out.println("Loi khi cap nhat khach hang: " + e.getMessage());
            return customers;
        }
    }

    public ArrayList<Customer> deleteCustomer(int customerId) {
        try {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getCustomerId() == customerId) {
                    customers.remove(i);
                    System.out.println("Da xoa khach hang ID: " + customerId);
                    return customers;
                }
            }
            System.out.println("Khong tim thay khach hang ID: " + customerId);
            return customers;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Loi truy cap danh sach: " + e.getMessage());
            return customers;
        } catch (Exception e) {
            System.out.println("Loi khi xoa khach hang: " + e.getMessage());
            return customers;
        }
    }

    public void printCustomerList() {
        try {
            int len = customers.size();
            if (len == 0) {
                System.out.println("Danh sach khach hang trong.");
                return;
            }
            for (int i = 0; i < len; i++) {
                System.out.println("Customer ID: " + customers.get(i).getCustomerId() +
                                 ", Fullname: " + customers.get(i).getFullname() +
                                 ", Phone: " + customers.get(i).getPhone() +
                                 ", Address: " + customers.get(i).getAddress());
            }
        } catch (Exception e) {
            System.out.println("Loi khi hien thi danh sach khach hang: " + e.getMessage());
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}