package com.example.CinemaAPI.infrastructure.service;

import com.example.CinemaAPI.domain.service.NewsTagService;
import com.example.CinemaAPI.infrastructure.persistence.entity.NewsTagEntity;
import com.example.CinemaAPI.infrastructure.persistence.repository.NewsTagRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsTagServiceImpl implements NewsTagService {

    private final NewsTagRepository newsTagRepository;

    public NewsTagServiceImpl(NewsTagRepository newsTagRepository) {
        this.newsTagRepository = newsTagRepository;
    }

    @Override
    public List<NewsTagEntity> findAll() {
        return newsTagRepository.findAll();
    }

    @Override
    public NewsTagEntity findById(Long id) {
        return newsTagRepository.findById(id).orElse(null);
    }
}