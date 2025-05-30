package manager;

import model.Customer;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class CustomerManager {
    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("da them khach hang: " + customer.getFullname());
        return customers;
    }

    public ArrayList<Customer> getEditCustomer(String fullname, int customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerId() == customerId) {
                System.out.println("true");
                customers.get(i).setFullname(fullname);
            }
        }
        return customers;
    }

    public ArrayList<Customer> getDeleteCustomer(int customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerId() == customerId) {
                customers.remove(i);
            }
        }
        return customers;
    }

    public void printCustomerList() {
        int len = customers.size();
        for (int i = 0; i < len; i++) {
            System.out.println("Customer ID: " + customers.get(i).getCustomerId() + 
                             ", Fullname: " + customers.get(i).getFullname());
        }
    }
}