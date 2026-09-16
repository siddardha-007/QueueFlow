package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
