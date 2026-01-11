package com.example.CinemaAPI.infrastructure.persistence.repository;

import com.example.CinemaAPI.infrastructure.persistence.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

    List<MovieEntity> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrGenreContainingIgnoreCase(
            String name,
            String description,
            String genre
    );
}