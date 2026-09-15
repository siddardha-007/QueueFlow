package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.enums.ShowSeatStatus;
import com.ramsid.QueueFlow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    List<ShowSeat> findByShowShowId(Long showId);

    List<ShowSeat> findByShowShowIdAndStatus(
            Long showId,
            ShowSeatStatus status
    );
}
