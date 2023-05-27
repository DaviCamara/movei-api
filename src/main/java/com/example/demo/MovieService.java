package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Movie saveMovie(Movie movie);

    Optional<Movie> findById(Integer id);

    List<Movie> getAllMovies();

    Movie updateMovie(Movie movie, Integer id);

void deleteMovie(Integer id);
}

