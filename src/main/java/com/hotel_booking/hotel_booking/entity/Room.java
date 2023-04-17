package com.hotel_booking.hotel_booking.entity;

import lombok.Builder;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "rooms")
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private boolean available;

    @Column(nullable = false)
    private BigDecimal pricePerNight;

    public Room(String name,
                int capacity,
                boolean available,
                BigDecimal pricePerNight) {
        this.name = name;
        this.capacity = capacity;
        this.available = available;
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", available=" + available +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
