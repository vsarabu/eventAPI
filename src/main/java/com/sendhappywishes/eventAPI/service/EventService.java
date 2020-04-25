package com.sendhappywishes.eventAPI.service;

import com.sendhappywishes.eventAPI.model.Event;
import com.sendhappywishes.eventAPI.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public String createEvent(Event event){
        eventRepository.save(event);
        return event.toString();
    }

    public Optional<Event> getEvent(Long eventId) {
        return eventRepository.findById(eventId);
    }

    public String deleteEvent(Long eventId) {
        eventRepository.deleteById(eventId);
        return "Deleted event: " + eventId;
    }

    public String updateEvent(Event event) {
        eventRepository.save(event);
        return event.toString();
    }

    public List<Event> findAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }
}
