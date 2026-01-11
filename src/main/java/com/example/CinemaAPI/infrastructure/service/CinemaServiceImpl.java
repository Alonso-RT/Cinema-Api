package com.example.CinemaAPI.infrastructure.service;

import com.example.CinemaAPI.domain.service.CinemaService;
import com.example.CinemaAPI.infrastructure.persistence.entity.CinemaEntity;
import com.example.CinemaAPI.infrastructure.persistence.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public List<CinemaEntity> findAll() {
        return cinemaRepository.findAll();
    }

    @Override
    public CinemaEntity findById(Long id) {
        return cinemaRepository.findById(id).orElse(null);
    }
}