package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.BookingSeat;
import com.ramsid.QueueFlow.repository.BookingSeatRepository;
import com.ramsid.QueueFlow.service.BookingSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingSeatServiceImpl implements BookingSeatService {

    @Autowired
    private BookingSeatRepository bookingSeatRepository;

    @Override
    public BookingSeat createBookingSeat(BookingSeat bookingSeat) {
        return bookingSeatRepository.save(bookingSeat);
    }

    @Override
    public BookingSeat getBookingSeatById(Long bookingSeatId) {
        return bookingSeatRepository.findById(bookingSeatId)
                .orElseThrow(() ->
                        new RuntimeException(
                                "BookingSeat not found with id: " + bookingSeatId
                        ));
    }

    @Override
    public List<BookingSeat> getAllBookingSeats() {
        return bookingSeatRepository.findAll();
    }

    @Override
    public List<BookingSeat> getBookingSeatsByBookingId(Long bookingId) {
        return bookingSeatRepository.findByBookingBookingId(bookingId);
    }

    @Override
    public BookingSeat updateBookingSeat(BookingSeat bookingSeat) {
        return bookingSeatRepository.save(bookingSeat);
    }

    @Override
    public void deleteBookingSeat(Long bookingSeatId) {
        BookingSeat existingBookingSeat =
                bookingSeatRepository.findById(bookingSeatId)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "BookingSeat not found with id: " + bookingSeatId
                                ));

        bookingSeatRepository.delete(existingBookingSeat);
    }
}