package com.example.CinemaAPI.infrastructure.service;

import com.example.CinemaAPI.domain.service.AdsService;
import com.example.CinemaAPI.infrastructure.persistence.entity.AdsEntity;
import com.example.CinemaAPI.infrastructure.persistence.repository.AdsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdsServiceImpl implements AdsService {

    private final AdsRepository adsRepository;

    public AdsServiceImpl(AdsRepository adsRepository) {
        this.adsRepository = adsRepository;
    }

    @Override
    public List<AdsEntity> findAll() {
        return adsRepository.findAll();
    }

    @Override
    public AdsEntity findById(Long id) {
        return adsRepository.findById(id).orElse(null);
    }
}