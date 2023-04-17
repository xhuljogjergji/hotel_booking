package com.hotel_booking.hotel_booking.service.impl;

import com.hotel_booking.hotel_booking.entity.User;
import com.hotel_booking.hotel_booking.exception.HotelManagementException;
import com.hotel_booking.hotel_booking.repository.UserRepository;
import com.hotel_booking.hotel_booking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        if (User.isEmpty()) {
            throw new HotelManagementException("User with id " + id + " not found");
        }
        return userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
