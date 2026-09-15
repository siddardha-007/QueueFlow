package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {
    List<Show> findByEventEventId(Long eventId);
}
