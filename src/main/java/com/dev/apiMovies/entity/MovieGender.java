package com.dev.apiMovies.entity;

import lombok.Data;

import javax.persistence.*;

@Data //getter and setters
@Entity //type of class
@Table(name = "character", schema = "movies") //table select

public class MovieGender {
    @Id
    private int movie_gender_id;

    @JoinColumn(name = "movie_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Movies movie;

    @JoinColumn(name = "gender_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private  Gender gender;
}
