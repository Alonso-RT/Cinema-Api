package com.example.CinemaAPI.infrastructure.service;

import com.example.CinemaAPI.domain.service.ReviewsService;
import com.example.CinemaAPI.infrastructure.persistence.entity.ReviewsEntity;
import com.example.CinemaAPI.infrastructure.persistence.repository.ReviewsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReviewsServiceImpl implements ReviewsService {

    private final ReviewsRepository reviewsRepository;

    public ReviewsServiceImpl(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    @Override
    public List<ReviewsEntity> findAll() {
        return reviewsRepository.findAll();
    }

    @Override
    public ReviewsEntity findById(Long id) {
        return reviewsRepository.findById(id).orElse(null);
    }

    @Override
    public ReviewsEntity create(ReviewsEntity review) {
        review.setDate(LocalDate.now());
        review.setLikes(0);
        return reviewsRepository.save(review);
    }

    @Override
    public List<ReviewsEntity> findByMovieId(Long movieId) {
        return reviewsRepository.findByMovieId(movieId);
    }
}