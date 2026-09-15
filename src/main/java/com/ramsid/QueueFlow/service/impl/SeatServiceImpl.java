package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.Seat;
import com.ramsid.QueueFlow.repository.SeatRepository;
import com.ramsid.QueueFlow.service.SeatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    private final SeatRepository seatRepository;

    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat getSeatById(Long id) {
        return seatRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Seat not found"));
    }

    @Override
    public Seat createSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public Seat updateSeat(Long id, Seat seat) {
        Seat existingSeat = getSeatById(id);

        existingSeat.setRowNumber(seat.getRowNumber());
        existingSeat.setSeatNumber(seat.getSeatNumber());
        existingSeat.setSeatType(seat.getSeatType());
        existingSeat.setScreen(seat.getScreen());

        return seatRepository.save(existingSeat);
    }

    @Override
    public void deleteSeat(Long id) {
        seatRepository.deleteById(id);
    }
}
