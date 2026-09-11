package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
