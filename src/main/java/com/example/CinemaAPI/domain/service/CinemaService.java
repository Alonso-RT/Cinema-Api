package com.example.CinemaAPI.domain.service;

import com.example.CinemaAPI.infrastructure.persistence.entity.CinemaEntity;
import java.util.List;

public interface CinemaService {
    List<CinemaEntity> findAll();
    CinemaEntity findById(Long id);
}