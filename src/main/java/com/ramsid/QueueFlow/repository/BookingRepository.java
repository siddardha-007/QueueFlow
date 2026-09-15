package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserUserId(Long userId);

    List<Booking> findByShowShowId(Long showId);
}
