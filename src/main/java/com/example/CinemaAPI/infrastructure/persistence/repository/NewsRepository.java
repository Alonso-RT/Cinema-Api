package com.example.CinemaAPI.infrastructure.persistence.repository;

import com.example.CinemaAPI.infrastructure.persistence.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
}