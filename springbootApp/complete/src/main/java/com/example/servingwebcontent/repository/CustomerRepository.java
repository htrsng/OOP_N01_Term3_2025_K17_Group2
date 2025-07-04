package com.example.servingwebcontent.repository;

import com.example.servingwebcontent.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Page<Customer> findByNameContainingIgnoreCase(String name, Pageable pageable);
    Page<Customer> findByPhoneNumberContaining(String phoneNumber, Pageable pageable);
    Page<Customer> findByEmailContainingIgnoreCase(String email, Pageable pageable);
    Page<Customer> findByAddressContainingIgnoreCase(String address, Pageable pageable);
    Page<Customer> findByRegistrationDateBetween(Date startDate, Date endDate, Pageable pageable);

    @Query("SELECT c FROM Customer c WHERE " +
           "(:address IS NULL OR LOWER(c.address) LIKE LOWER(CONCAT('%', :address, '%')))")
    Page<Customer> searchCustomers(@Param("address") String address, Pageable pageable);
}