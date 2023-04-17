package com.hotel_booking.hotel_booking.repository;

import com.hotel_booking.hotel_booking.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface GuestRepository extends JpaRepository<Guest,Long> {
    Optional<Guest> findByEmail(String email);
}
