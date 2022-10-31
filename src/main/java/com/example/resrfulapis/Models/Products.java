package com.example.resrfulapis.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table ( name ="products")
public class Products {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private int qty;
    private int price;



}
