package com.example.resrfulapis.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table ( name = "services")
public class ChurchServices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String offering;
    private String tithes;
    private String date;
    private String attendance;
    private String femaleno;
    private String maleno;
    private String kidsno;
    private Date created = new Date();
    private Date updated = new Date();

    @PreUpdate
    public void setLastUpdate() {
        this.updated = new Date();
    }
}
