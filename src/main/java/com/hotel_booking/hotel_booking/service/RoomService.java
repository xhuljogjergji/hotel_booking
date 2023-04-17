package com.hotel_booking.hotel_booking.service;

import com.hotel_booking.hotel_booking.entity.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    List<Room> getAllRooms();

    Optional<Room> getRoomById(Long id);

    Room createRoom(Room room);

    Room updateRoom(Room room);

    void deleteRoomById(Long id);
}
