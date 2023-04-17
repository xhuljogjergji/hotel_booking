package com.hotel_booking.hotel_booking.repository;

import com.hotel_booking.hotel_booking.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findByCheckInDateBetween(LocalDate startDate, LocalDate endDate);

    List<Reservation> findByCheckOutDateBetween(LocalDate startDate, LocalDate endDate);

}
