package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.Booking;
import com.ramsid.QueueFlow.repository.BookingRepository;
import com.ramsid.QueueFlow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId)
                .orElseThrow(()->new RuntimeException("Booking not found with id: " + bookingId));
    }

    @Override
    public List<Booking> getBookingsByUserId(Long userId) {
        return bookingRepository.findByUserUserId(userId);
    }

    @Override
    public List<Booking> getBookingsByShowId(Long showId) {
        return bookingRepository.findByShowShowId(showId);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public void deleteBooking(Long bookingId) {
        Booking existingBooking = bookingRepository.findById(bookingId)
                .orElseThrow(()->new RuntimeException("Booking not found with id: " + bookingId));
        bookingRepository.delete(existingBooking);
    }
}