package com.example.resrfulapis.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table( name = "members")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( exclude = "nameAttributeInThisClassWithOneToMany")
public class Members implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column ( name = "member_id")
    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String county;
    private String residence;
    private String gender;
    private Date created = new Date();
    private Date updated = new Date();

    @PreUpdate
    public void setLastUpdate() {
        this.updated = new Date();
    }


}
