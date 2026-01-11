package com.example.CinemaAPI.domain.service;

import com.example.CinemaAPI.infrastructure.persistence.entity.MovieEntity;
import java.util.List;

public interface MovieService {
    List<MovieEntity> findAll();
    MovieEntity findById(Long id);
    List<MovieEntity> search(String query);
}
