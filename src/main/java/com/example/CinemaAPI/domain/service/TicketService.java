package com.example.CinemaAPI.domain.service;

import com.example.CinemaAPI.api.dtos.CreateTicketRequest;
import com.example.CinemaAPI.infrastructure.persistence.entity.TicketEntity;
import java.util.List;

public interface TicketService {
    List<TicketEntity> findAll();
    TicketEntity findById(Long id);
    TicketEntity create(CreateTicketRequest ticket);
}