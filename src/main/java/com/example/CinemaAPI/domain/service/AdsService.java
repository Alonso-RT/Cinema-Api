package com.example.CinemaAPI.domain.service;

import com.example.CinemaAPI.infrastructure.persistence.entity.AdsEntity;
import java.util.List;

public interface AdsService {
    List<AdsEntity> findAll();
    AdsEntity findById(Long id);
}