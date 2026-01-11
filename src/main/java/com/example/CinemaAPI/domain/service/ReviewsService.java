package com.example.CinemaAPI.domain.service;

import com.example.CinemaAPI.infrastructure.persistence.entity.ReviewsEntity;
import java.util.List;

public interface ReviewsService {
    List<ReviewsEntity> findAll();
    ReviewsEntity findById(Long id);
    ReviewsEntity create(ReviewsEntity review);
    List<ReviewsEntity> findByMovieId(Long movieId);
}