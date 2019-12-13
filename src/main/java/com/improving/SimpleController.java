package com.improving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.GeneratedValue;
import javax.validation.Valid;
import java.net.URI;

@RestController
public class SimpleController {
    @Autowired
    private MoviesRepo moviesRepo;

//    public SimpleController() {
//    }

    @GetMapping(path = "/movies")
    public @ResponseBody
    Iterable<Movies> getAllMovies() {
        return moviesRepo.findAll();
    }

    @GetMapping("/movies/{movieId}")
    public Movies getMovieById(@PathVariable Integer movieId) {
        return moviesRepo.findById(movieId).get();
    }


//    @PostMapping("/movies")
//    public ResponseEntity<Object> createMovie(@RequestBody Movies movies) {
//        Movies savedMovie = moviesRepo.save(movies);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/movies")
//                .buildAndExpand(savedMovie.getMovieId()).toUri();
//
//        return ResponseEntity.created(location).build();
//    }

    @PutMapping("/movies")
    public ResponseEntity<Movies> createMovie(@RequestBody Movies movies){
        Movies savedMovie = moviesRepo.save(movies);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/movies")
                .buildAndExpand(savedMovie.getMovieId()).toUri();
        return ResponseEntity.created(location).build();
    }


    @PutMapping("/movies/{movieId}")
    public ResponseEntity<Object> updateMovie(@RequestBody Movies movies) {
        Movies savedMovie = moviesRepo.save(movies);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{movieId}")
                .buildAndExpand(savedMovie.getMovieId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
