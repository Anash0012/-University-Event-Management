package com.geekster.Event.Management.Service;

import com.geekster.Event.Management.Model.Event;
import com.geekster.Event.Management.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;




    public String addEvent(Event event) {
        eventRepository.save(event);
        return "Event added successfully!";
    }

    public String updateEvent(Long id, Event event) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()) {
            Event existingEvent = optionalEvent.get();
            existingEvent.setEventName(event.getEventName());
            existingEvent.setLocationOfEvent(event.getLocationOfEvent());
            existingEvent.setDate(event.getDate());
            existingEvent.setStartTime(event.getStartTime());
            existingEvent.setEndTime(event.getEndTime());
            eventRepository.save(existingEvent);
            return "Event updated successfully!";
        } else {
            return "Event not found!";
        }
    }

    public String deleteEvent(Long id) {
        if (eventRepository.existsById(id)) {
            eventRepository.deleteById(id);
            return "Event deleted successfully!";
        } else {
            return "Event not found!";
        }
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return eventRepository.findAllByDate(date);
    }
}


