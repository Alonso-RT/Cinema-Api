package com.example.CinemaAPI.api.controller;

import com.example.CinemaAPI.domain.service.AdsService;
import com.example.CinemaAPI.infrastructure.persistence.entity.AdsEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ads")
public class AdsController {

    private final AdsService adsService;

    public AdsController(AdsService adsService) {
        this.adsService = adsService;
    }

    @GetMapping
    public List<AdsEntity> findAll() {
        return adsService.findAll();
    }

    @GetMapping("/{id}")
    public AdsEntity findById(@PathVariable Long id) {
        return adsService.findById(id);
    }
}