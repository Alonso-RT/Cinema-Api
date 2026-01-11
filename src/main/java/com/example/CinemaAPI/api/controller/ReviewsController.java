package com.example.CinemaAPI.api.controller;

import com.example.CinemaAPI.domain.service.ReviewsService;
import com.example.CinemaAPI.infrastructure.persistence.entity.ReviewsEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {

    private final ReviewsService reviewService;

    public ReviewsController(ReviewsService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<ReviewsEntity> findAll() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public ReviewsEntity findById(@PathVariable Long id) {
        return reviewService.findById(id);
    }

    @GetMapping("/movie/{movieId}")
    public List<ReviewsEntity> findByMovieId(@PathVariable Long movieId) {
        return reviewService.findByMovieId(movieId);
    }

    @PostMapping
    public ReviewsEntity create(@RequestBody ReviewsEntity review) {
        return reviewService.create(review);
    }
}