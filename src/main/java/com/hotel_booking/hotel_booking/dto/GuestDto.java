package com.hotel_booking.hotel_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GuestDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;
}
