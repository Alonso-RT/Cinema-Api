package com.example.CinemaAPI.infrastructure.persistence.repository;

import com.example.CinemaAPI.infrastructure.persistence.entity.ReviewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewsRepository extends JpaRepository<ReviewsEntity, Long> {
    List<ReviewsEntity> findByMovieId(Long movieId);
}