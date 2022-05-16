package com.dev.apiMovies.entity;

import lombok.Data;

import javax.persistence.*;

@Data //getter and setters
@Entity //type of class
@Table(name = "character", schema = "movies") //table select

public class Character {
     @Id
     @Column(name = "character_id")
     @GeneratedValue (strategy = GenerationType.IDENTITY) //autoincrement
     private Integer characterId;
     private String image;
     private String name;
     private int age;
     private Float weigth;
     private String history;


}
