package com.example.resrfulapis.Models;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@ToString
@Table(name ="customers")
public class Customerrs {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String email;
    private String gender;




}
