package com.example.CinemaAPI.infrastructure.persistence.repository;

import com.example.CinemaAPI.infrastructure.persistence.entity.NewsTagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsTagRepository extends JpaRepository<NewsTagEntity, Long> {
}