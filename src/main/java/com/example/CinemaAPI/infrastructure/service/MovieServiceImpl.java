package com.example.CinemaAPI.infrastructure.service;

import com.example.CinemaAPI.domain.service.MovieService;
import com.example.CinemaAPI.infrastructure.persistence.entity.MovieEntity;
import com.example.CinemaAPI.infrastructure.persistence.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieEntity> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public MovieEntity findById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<MovieEntity> search(String query) {
        return movieRepository
                .findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrGenreContainingIgnoreCase(
                        query, query, query
                );
    }
}
