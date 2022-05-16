package com.dev.apiMovies.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data //getter and settets
@Entity //type of class
@Table(name = "movies", schema = "movies") //table select
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;
    private String movie_image;
    private String movie_title;
    private LocalDateTime movie_date;
    private Integer movie_score;


}
