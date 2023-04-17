package com.hotel_booking.hotel_booking.service;

import com.hotel_booking.hotel_booking.entity.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface InvoiceService {
    List<Invoice> getAllInvoices();

    Optional<Invoice> getInvoiceById(Long id);

    Invoice createInvoice(Invoice invoice);

    Invoice updateInvoice(Invoice invoice);

    void deleteInvoiceById(Long id);
}
