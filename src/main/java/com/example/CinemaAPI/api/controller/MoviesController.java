package com.example.CinemaAPI.api.controller;

import com.example.CinemaAPI.domain.service.MovieService;
import com.example.CinemaAPI.infrastructure.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private final MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieEntity> findAll() {
        return movieService.findAll();
    }

    @GetMapping("/{id}")
    public MovieEntity findById(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @GetMapping("/search")
    public List<MovieEntity> search(@RequestParam String query) {
        return movieService.search(query);
    }
}