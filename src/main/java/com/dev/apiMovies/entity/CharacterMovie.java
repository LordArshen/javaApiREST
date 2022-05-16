package com.dev.apiMovies.entity;

import lombok.Data;

import javax.persistence.*;

@Data //getter and settets
@Entity //type of class
@Table(name = "character_movie", schema = "movies") //table select

public class CharacterMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int character_movie_id ;

    @JoinColumn(name = "movie_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Movies movie_id ;

    @JoinColumn(name = "character_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Character character_id ;
}
