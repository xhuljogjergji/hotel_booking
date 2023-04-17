package com.hotel_booking.hotel_booking.exception;

public class HotelManagementException extends RuntimeException{
    public HotelManagementException(String s) {

    }

    public static String HotelManagementException(String message) {
        return(message);
    }
}
