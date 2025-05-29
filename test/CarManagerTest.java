package test;

import manager.CustomerManager;
import model.Customer;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class CustomerManagerTest {
    private CustomerManager customerManager;

    @Before
    public void setUp() {
        customerManager = new CustomerManager();
    }

    @Test
    public void testAddCustomer() {
        Customer customer = new Customer(1, "Test Customer", "123456789", "test@example.com", "Hanoi", LocalDateTime.now());
        customerManager.addCustomer(customer);
        Customer retrieved = customerManager.getCustomerById(1);
        assertNotNull(retrieved);
        assertEquals("Test Customer", retrieved.getName());
    }

    @Test
    public void testUpdateCustomer() {
        Customer customer = new Customer(1, "Test Customer", "123456789", "test@example.com", "Hanoi", LocalDateTime.now());
        customerManager.addCustomer(customer);
        customer.setName("Updated Customer");
        customerManager.updateCustomer(customer);
        Customer retrieved = customerManager.getCustomerById(1);
        assertEquals("Updated Customer", retrieved.getName());
    }

    @Test
    public void testDeleteCustomer() {
        Customer customer = new Customer(1, "Test Customer", "123456789", "test@example.com", "Hanoi", LocalDateTime.now());
        customerManager.addCustomer(customer);
        customerManager.deleteCustomer(1);
        Customer retrieved = customerManager.getCustomerById(1);
        assertNull(retrieved);
    }
}