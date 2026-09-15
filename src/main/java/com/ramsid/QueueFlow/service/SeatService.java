package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> getAllSeats();

    Seat getSeatById(Long id);

    Seat createSeat(Seat seat);

    Seat updateSeat(Long id, Seat seat);

    void deleteSeat(Long id);
}
