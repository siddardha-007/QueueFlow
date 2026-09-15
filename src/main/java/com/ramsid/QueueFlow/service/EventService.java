package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event);

    Event getEventById(Long eventId);

    List<Event> getAllEvents();

    Event updateEvent(Long eventId, Event event);

    void deleteEvent(Long eventId);

}
