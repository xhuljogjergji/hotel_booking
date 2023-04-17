package com.hotel_booking.hotel_booking.controller;

import com.hotel_booking.hotel_booking.dto.UserDTO;
import com.hotel_booking.hotel_booking.entity.User;
import com.hotel_booking.hotel_booking.service.UserService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        List<UserDTO> userDTOs = users.stream()
                .map(user -> UserDTO.fromEntity((User))
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(userDTOs);
    }

    @GetMapping("/{id}")
    public Long getUserById(@PathVariable Long id) throws NotFoundException {
        User user = userService.getUserById(id);
        UserDTO userDTO = UserDTO.fromEntity(user);
        return ResponseEntity.ok().body(userDTO);
    }

    @PostMapping("")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        User user = userService.createUser(UserDTO.toEntity(userDTO));
        UserDTO createdUserDTO = UserDTO.fromEntity(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO)
            throws NotFoundException {
        User user = userService.updateUser(id, UserDTO.builder()

                .build());
        UserDTO updatedUserDTO = UserDTO.builder()
                .build();
        return ResponseEntity.ok().body(updatedUserDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}