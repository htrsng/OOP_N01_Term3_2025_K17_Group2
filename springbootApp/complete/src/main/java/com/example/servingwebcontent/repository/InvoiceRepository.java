package com.example.servingwebcontent.repository;

import com.example.servingwebcontent.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {
    @Query("SELECT i FROM Invoice i WHERE i.date BETWEEN :startDate AND :endDate")
    List<Invoice> findByDateRange(Date startDate, Date endDate);
}