package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.BookingSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingSeatRepository extends JpaRepository<BookingSeat, Long> {

    List<BookingSeat> findByBookingBookingId(Long bookingId);
}