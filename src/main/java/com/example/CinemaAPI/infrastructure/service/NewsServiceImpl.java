package com.example.CinemaAPI.infrastructure.service;

import com.example.CinemaAPI.domain.service.NewsService;
import com.example.CinemaAPI.infrastructure.persistence.entity.NewsEntity;
import com.example.CinemaAPI.infrastructure.persistence.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<NewsEntity> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public NewsEntity findById(Long id) {
        return newsRepository.findById(id).orElse(null);
    }
}