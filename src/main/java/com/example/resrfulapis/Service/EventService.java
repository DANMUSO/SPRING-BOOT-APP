package com.example.resrfulapis.Service;

import com.example.resrfulapis.Models.Events;
import com.example.resrfulapis.Models.Members;
import com.example.resrfulapis.Repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

@Service
public class EventService {

    @Autowired

    private EventsRepository eventsRepository;

    public List<Events> getEvents(){
        return eventsRepository.findAll();
    }



    public void addEvent(Events events){

        System.out.println(events);
        eventsRepository.save(events);
    }

    public void updateEvent(Events events){
        eventsRepository.save(events);
    }

    public void deleteEvent(Integer id){
        eventsRepository.deleteById(id);
    }
}
