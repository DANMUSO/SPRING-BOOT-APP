package com.example.resrfulapis.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.CascadeType.PERSIST;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "events")

public class Events implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;

    private String member_id;
    private String eventname;
    private String eventdate;
    private String eventvenue;
    private String eventtype;

    private String eventexpenses;
    private String eventguests;
    private Date created = new Date();
    private Date updated = new Date();
    public Events(String member_id, String eventname, String eventdate, String eventvenue, String eventtype, String eventexpenses, String eventguests) {
        this.member_id = member_id;
        this.eventname = eventname;
        this.eventdate = eventdate;
        this.eventvenue = eventvenue;
        this.eventtype = eventtype;
        this.eventexpenses = eventexpenses;
        this.eventguests = eventguests;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventvenue() {
        return eventvenue;
    }

    public void setEventvenue(String eventvenue) {
        this.eventvenue = eventvenue;
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public String getEventexpenses() {
        return eventexpenses;
    }

    public void setEventexpenses(String eventexpenses) {
        this.eventexpenses = eventexpenses;
    }

    public String getEventguests() {
        return eventguests;
    }

    public void setEventguests(String eventguests) {
        this.eventguests = eventguests;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }


    @PreUpdate
    public void setLastUpdate() {
        this.updated = new Date();
    }



}
