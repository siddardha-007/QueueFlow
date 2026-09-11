package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
