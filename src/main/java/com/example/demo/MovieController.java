package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/movie")
public class MovieController {
   // @Autowired
  private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(path= "/health")
    public String helloWord() {
        String hi = "helloWord";
        return hi;
    }


    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        Movie responseMovie = movieService.saveMovie(movie);

        return new ResponseEntity<Movie>(responseMovie, HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public Optional<Movie> getMovie(@PathVariable Integer id) {
        Optional<Movie> movie = movieService.findById(id);

        return movie;
    }

@GetMapping
    public List<Movie> getAllMovies(){
return movieService.getAllMovies();
    }

 @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable("id") Integer id,
                                             @RequestBody Movie movie){

        return new ResponseEntity<Movie>(movieService.updateMovie(movie,id),HttpStatus.OK);
 }

@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable("id") Integer id){

        movieService.deleteMovie(id);
        return new ResponseEntity<String>("Movie deleted sucessufully", HttpStatus.OK);
}


}

