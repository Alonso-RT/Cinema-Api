package com.example.CinemaAPI.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "cinema_id")
    private Long cinemaId;

    @Column(name = "buyer_firstname")
    private String buyerFirstname;

    @Column(name = "buyer_lastname")
    private String buyerLastname;

    private Integer quantity;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    public TicketEntity() {
    }

    public TicketEntity(
            Long id,
            Long movieId,
            Long cinemaId,
            String buyerFirstname,
            String buyerLastname,
            Integer quantity,
            Double totalPrice,
            LocalDateTime purchaseDate
    ) {
        this.id = id;
        this.movieId = movieId;
        this.cinemaId = cinemaId;
        this.buyerFirstname = buyerFirstname;
        this.buyerLastname = buyerLastname;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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