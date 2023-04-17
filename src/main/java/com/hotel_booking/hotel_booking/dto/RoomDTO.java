package com.hotel_booking.hotel_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomDTO {
    private Long id;

    private String name;

    private int capacity;

    private boolean available;

    private BigDecimal pricePerNight;
}
