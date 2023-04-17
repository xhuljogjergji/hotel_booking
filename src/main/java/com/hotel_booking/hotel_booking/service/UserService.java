package com.hotel_booking.hotel_booking.service;

import com.hotel_booking.hotel_booking.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUserById(Long id);
}
