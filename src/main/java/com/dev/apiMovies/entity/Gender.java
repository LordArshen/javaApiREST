package com.dev.apiMovies.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.*;

@Data //getter and setters
@Entity //type of class
@Table(name = "gender", schema = "movies") //table select

public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gender_id   ;
    private String gender_image   ;
}
