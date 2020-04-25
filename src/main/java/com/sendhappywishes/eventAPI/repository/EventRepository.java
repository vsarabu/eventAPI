package com.sendhappywishes.eventAPI.repository;

import com.sendhappywishes.eventAPI.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    Event findById(long id);
//    Iterable<Event> findAll(long id);
    long deleteById(long id);
}
