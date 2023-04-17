package com.hotel_booking.hotel_booking.service.impl;

import com.hotel_booking.hotel_booking.dto.GuestDTO;
import com.hotel_booking.hotel_booking.entity.Guest;
import com.hotel_booking.hotel_booking.repository.GuestRepository;
import com.hotel_booking.hotel_booking.service.GuestService;

import java.util.List;
import java.util.Optional;

public class GuestServiceImpl implements GuestService {
    private final GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    public Optional<Guest> getGuestById(Long id) {
        return guestRepository.findById(id);
    }

    @Override
    public Guest createGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public Guest updateGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public void deleteGuestById(Long id) {
        guestRepository.deleteById(id);
    }
}
