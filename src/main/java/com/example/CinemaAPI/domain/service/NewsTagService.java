package com.example.CinemaAPI.domain.service;

import com.example.CinemaAPI.infrastructure.persistence.entity.NewsTagEntity;
import java.util.List;

public interface NewsTagService {
    List<NewsTagEntity> findAll();
    NewsTagEntity findById(Long id);
}