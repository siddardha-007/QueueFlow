package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.BookingSeat;

import java.util.List;

public interface BookingSeatService {

    BookingSeat createBookingSeat(BookingSeat bookingSeat);

    BookingSeat getBookingSeatById(Long bookingSeatId);

    List<BookingSeat> getAllBookingSeats();

    List<BookingSeat> getBookingSeatsByBookingId(Long bookingId);

    BookingSeat updateBookingSeat(BookingSeat bookingSeat);

    void deleteBookingSeat(Long bookingSeatId);
}