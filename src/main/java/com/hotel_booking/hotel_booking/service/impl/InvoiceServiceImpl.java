package com.hotel_booking.hotel_booking.service.impl;

import com.hotel_booking.hotel_booking.dto.InvoiceDTO;
import com.hotel_booking.hotel_booking.entity.Invoice;
import com.hotel_booking.hotel_booking.repository.InvoiceRepository;
import com.hotel_booking.hotel_booking.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Optional<Invoice> getInvoiceById(Long id) {
        return invoiceRepository.findById(id);
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public void deleteInvoiceById(Long id) {
        invoiceRepository.deleteById(id);
    }

    @Override
    public Invoice addInvoice(InvoiceDTO invoiceDTO) {
        return invoiceRepository.save(invoiceDTO);
    }

    @Override
    public InvoiceDTO updateInvoice(Long id, InvoiceDTO invoiceDTO) {
        return null;
    }
}
