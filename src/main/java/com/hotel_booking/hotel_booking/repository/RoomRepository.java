package com.hotel_booking.hotel_booking.repository;

import com.hotel_booking.hotel_booking.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    List<Room> findByAvailable(boolean available);

    List<Room> findByCapacityGreaterThanEqual(int capacity);

    List<Room> findByPricePerNightLessThanEqual(BigDecimal maxPrice);

}
