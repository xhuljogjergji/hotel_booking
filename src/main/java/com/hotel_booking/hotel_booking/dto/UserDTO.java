package com.hotel_booking.hotel_booking.dto;

import com.hotel_booking.hotel_booking.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;

    private String username;

    private UserRole role;

}
