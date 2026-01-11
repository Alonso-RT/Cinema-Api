package com.example.CinemaAPI.api.controller;

import com.example.CinemaAPI.domain.service.CinemaService;
import com.example.CinemaAPI.infrastructure.persistence.entity.CinemaEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemasController {

    private final CinemaService cinemaService;

    public CinemasController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public List<CinemaEntity> findAll() {
        return cinemaService.findAll();
    }

    @GetMapping("/{id}")
    public CinemaEntity findById(@PathVariable Long id) {
        return cinemaService.findById(id);
    }
}