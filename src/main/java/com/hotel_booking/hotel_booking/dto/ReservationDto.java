package com.hotel_booking.hotel_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationDto {
    private Long id;

    private RoomDto room;

    private GuestDto guest;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int numberOfGuests;

    private UserDto user;
}
