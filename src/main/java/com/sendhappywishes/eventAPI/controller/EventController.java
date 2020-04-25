package com.sendhappywishes.eventAPI.controller;

import com.sendhappywishes.eventAPI.model.Event;
import com.sendhappywishes.eventAPI.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/createEvent")
    public String createEvent(@RequestBody Event event){
        return eventService.createEvent(event);
    }

    @GetMapping("/getEvent/{eventId}")
    public Optional<Event> getEvent(@PathVariable Long eventId){
        return eventService.getEvent(eventId);
    }

    @DeleteMapping("/deleteEvent/{eventId}")
    public String deleteEvent(@PathVariable Long eventId){
        return eventService.deleteEvent(eventId);
    }

    @PutMapping("/updateEvent")
    public String updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }

    @GetMapping("/findAllEvents")
    public List<Event> findAllEvents(){
        return eventService.findAllEvents();
    }

    @GetMapping("/hi")
    public String home() {
        return "Hello World!";
    }
}
