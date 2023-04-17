package com.hotel_booking.hotel_booking.entity;


import lombok.Builder;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "invoices")
@Builder
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private boolean paid;

    @ManyToOne(optional = false)
    private Reservation reservation;

    public Invoice(BigDecimal amount, boolean paid, Reservation reservation) {
        this.amount = amount;
        this.paid = paid;
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", amount=" + amount +
                ", paid=" + paid +
                ", reservation=" + reservation +
                '}';
    }
}