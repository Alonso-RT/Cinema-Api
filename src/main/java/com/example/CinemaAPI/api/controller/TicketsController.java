package com.example.CinemaAPI.api.controller;

import com.example.CinemaAPI.api.dtos.CreateTicketRequest;
import com.example.CinemaAPI.domain.service.TicketService;
import com.example.CinemaAPI.infrastructure.persistence.entity.TicketEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketsController {

    private final TicketService ticketService;

    public TicketsController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<TicketEntity> findAll() {
        return ticketService.findAll();
    }

    @GetMapping("/{id}")
    public TicketEntity findById(@PathVariable Long id) {
        return ticketService.findById(id);
    }

    @PostMapping
    public TicketEntity create(@Valid @RequestBody CreateTicketRequest request) {
        return ticketService.create(request);
    }
}