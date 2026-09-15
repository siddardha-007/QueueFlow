package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.Event;
import com.ramsid.QueueFlow.repository.EventRepository;
import com.ramsid.QueueFlow.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;
    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(()->new RuntimeException("Event not found with id: " + eventId));
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event updateEvent(Long eventId, Event event) {
       Event existingEvent = eventRepository.findById(eventId)
               .orElseThrow(()->new RuntimeException("Event not found with id: " + eventId));

       existingEvent.setTitle(event.getTitle());
       existingEvent.setDuration_minutes(event.getDuration_minutes());
       existingEvent.setLanguage(event.getLanguage());
       existingEvent.setGenre(event.getGenre());
       return eventRepository.save(existingEvent);
    }

    @Override
    public void deleteEvent(Long eventId) {
        Event existingEvent = eventRepository.findById(eventId)
                .orElseThrow(()->new RuntimeException("Event not found with id: " + eventId));
        eventRepository.delete(existingEvent);
    }
}
