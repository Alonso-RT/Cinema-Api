package com.example.CinemaAPI.domain.service;

import com.example.CinemaAPI.infrastructure.persistence.entity.NewsEntity;
import java.util.List;

public interface NewsService {
    List<NewsEntity> findAll();
    NewsEntity findById(Long id);
}