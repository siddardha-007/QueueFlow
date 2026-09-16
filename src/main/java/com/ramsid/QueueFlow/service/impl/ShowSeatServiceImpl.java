package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.enums.ShowSeatStatus;
import com.ramsid.QueueFlow.model.ShowSeat;
import com.ramsid.QueueFlow.repository.ShowSeatRepository;
import com.ramsid.QueueFlow.service.ShowSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowSeatServiceImpl implements ShowSeatService {
    @Autowired
    private ShowSeatRepository showSeatRepository;

    @Override
    public ShowSeat createShowSeat(ShowSeat showSeat) {
        return showSeatRepository.save(showSeat);
    }

    @Override
    public ShowSeat getShowSeatById(Long showSeatId) {
        return showSeatRepository.findById(showSeatId)
                .orElseThrow(()->new RuntimeException("ShowSeat not found with id: " + showSeatId));
    }

    @Override
    public List<ShowSeat> getAllShowSeats() {
        return showSeatRepository.findAll();
    }

    @Override
    public List<ShowSeat> getShowSeatsByShowId(Long showId) {
        return showSeatRepository.findByShowShowId(showId);
    }

    @Override
    public List<ShowSeat> getAvailableShowSeats(Long showId) {
        return showSeatRepository.findByShowShowIdAndStatus(showId,
                ShowSeatStatus.AVAILABLE
                );
    }

    @Override
    public ShowSeat updateShowSeat(ShowSeat showSeat) {
        return showSeatRepository.save(showSeat);
    }

    @Override
    public void deleteShowSeat(Long showSeatId) {
        ShowSeat existingShowSeat =  showSeatRepository.findById(showSeatId)
                .orElseThrow(()->new RuntimeException("ShowSeat not found with id: " + showSeatId));
        showSeatRepository.delete(existingShowSeat);
    }
}
