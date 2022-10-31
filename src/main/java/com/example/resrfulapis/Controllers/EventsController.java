package com.example.resrfulapis.Controllers;

import com.example.resrfulapis.Models.Events;
import com.example.resrfulapis.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/apis")
public class EventsController {

    @Autowired

    private EventService eventService;


    @GetMapping("/events")
    public List<Events>  getEvents(){
        return eventService.getEvents();
    }


    @PostMapping("/addevent")
    public int addEvent(@RequestBody Events events){
        eventService.addEvent(events);
        System.out.println(events);
        return events.getId();
    }

    @PutMapping("/{id}/update")
    public int updateEvent(@PathVariable("id") Integer id, @RequestBody Events events){
      eventService.updateEvent(events);

      return events.getId();
    }

    @DeleteMapping("/{eventid}/delete")
    public void deleteEvent(@PathVariable("eventid") Integer eventid){
      eventService.deleteEvent(eventid);
    }

}
