package com.example.CinemaAPI.infrastructure.service;

import com.example.CinemaAPI.api.dtos.CreateTicketRequest;
import com.example.CinemaAPI.domain.service.TicketService;
import com.example.CinemaAPI.infrastructure.persistence.entity.TicketEntity;
import com.example.CinemaAPI.infrastructure.persistence.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<TicketEntity> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public TicketEntity findById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    @Override
    public TicketEntity create(CreateTicketRequest request) {

        TicketEntity entity = new TicketEntity();
        entity.setMovieId(request.getMovieId());
        entity.setCinemaId(request.getCinemaId());
        entity.setBuyerFirstname(request.getBuyerFirstname());
        entity.setBuyerLastname(request.getBuyerLastname());
        entity.setQuantity(request.getQuantity());
        entity.setTotalPrice(request.getTotalPrice());
        entity.setPurchaseDate(request.getPurchaseDate());

        return ticketRepository.save(entity);
    }
}