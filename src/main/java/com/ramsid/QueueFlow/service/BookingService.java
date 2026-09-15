package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.Booking;

import java.util.List;

public interface BookingService{
    Booking createBooking(Booking booking);

    Booking getBookingById(Long bookingId);

    List<Booking> getBookingsByUserId(Long userId);

    List<Booking> getBookingsByShowId(Long showId);

    Booking updateBooking(Booking booking);

    List<Booking> getAllBookings();

    void deleteBooking(Long bookingId);
}
