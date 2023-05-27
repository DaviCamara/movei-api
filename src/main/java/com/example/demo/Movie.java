package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
@Entity
@Data
@Table(name="movie")
public class Movie {
    @Getter
    @Setter
    @Id
    @GeneratedValue
    @Column(name="movie_id")
    private Integer movieId;

    @Column(name="title")
    private String title;

    @Column(name="budget")
    private Integer budget;

    @Column(name="homepage")
    private String homepage;

    @Column(name="overview")
    private String overview;

    @Column(name="popularity")
    private BigDecimal popularity;

    @Column(name="release_date")
    private Date releaseDate;

    @Column(name="revenue")
    private BigInteger revenue;

    @Column(name="runtime")
    private Integer runtime;

    @Column(name="movie_status")
    private String movieStatus;

    @Column(name="tagline")
    private String tagline;

    @Column(name="vote_average")
    private BigDecimal voteAverage;

    @Column(name="vote_count")
    private Integer voteCount;

    @Column(name="id")
    private Integer id;

}
