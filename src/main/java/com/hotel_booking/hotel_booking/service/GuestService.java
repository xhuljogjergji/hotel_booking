package com.hotel_booking.hotel_booking.service;

import com.hotel_booking.hotel_booking.dto.GuestDTO;
import com.hotel_booking.hotel_booking.entity.Guest;
import com.hotel_booking.hotel_booking.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GuestService {
    List<Guest> getAllGuests();

    Optional<Guest> getGuestById(Long id);

    Guest createGuest(Guest guest);

    Guest updateGuest(Guest guest);

    void deleteGuestById(Long id);
}
