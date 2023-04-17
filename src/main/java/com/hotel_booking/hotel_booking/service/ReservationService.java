package com.hotel_booking.hotel_booking.service;

import com.hotel_booking.hotel_booking.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> getAllReservations();

    Optional<Reservation> getReservationById(Long id);

    Reservation createReservation(Reservation reservation);

    Reservation updateReservation(Reservation reservation);

    void deleteReservationById(Long id);
}
