package com.example.CinemaAPI.api.controller;

import com.example.CinemaAPI.domain.service.NewsService;
import com.example.CinemaAPI.infrastructure.persistence.entity.NewsEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public List<NewsEntity> findAll() {
        return newsService.findAll();
    }

    @GetMapping("/{id}")
    public NewsEntity findById(@PathVariable Long id) {
        return newsService.findById(id);
    }
}