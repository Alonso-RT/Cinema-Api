package com.example.CinemaAPI.api.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public class CreateTicketRequest {

    @NotNull(message = "movieId es obligatorio")
    private Long movieId;

    @NotNull(message = "cinemaId es obligatorio")
    private Long cinemaId;

    @NotBlank(message = "buyerFirstname es obligatorio")
    private String buyerFirstname;

    @NotBlank(message = "buyerLastname es obligatorio")
    private String buyerLastname;

    @NotNull(message = "quantity es obligatoria")
    @Min(value = 1, message = "quantity debe ser al menos 1")
    private Integer quantity;

    @NotNull(message = "totalPrice es obligatorio")
    @Positive(message = "totalPrice debe ser mayor a 0")
    private Double totalPrice;

    @NotNull(message = "purchaseDate es obligatorio")
    private LocalDateTime purchaseDate;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getBuyerFirstname() {
        return buyerFirstname;
    }

    public void setBuyerFirstname(String buyerFirstname) {
        this.buyerFirstname = buyerFirstname;
    }

    public String getBuyerLastname() {
        return buyerLastname;
    }

    public void setBuyerLastname(String buyerLastname) {
        this.buyerLastname = buyerLastname;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}