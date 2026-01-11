package com.example.CinemaAPI.infrastructure.persistence.repository;

import com.example.CinemaAPI.infrastructure.persistence.entity.AdsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepository extends JpaRepository<AdsEntity, Long> {
}