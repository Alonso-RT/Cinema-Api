package com.example.CinemaAPI.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String rating;
    private String runtime;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    private String genre;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "trailer_url")
    private String trailerUrl;

    public MovieEntity() {
    }

    public MovieEntity(
            Long id,
            String name,
            String description,
            String rating,
            String runtime,
            LocalDate releaseDate,
            String genre,
            String imgUrl,
            String trailerUrl
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.runtime = runtime;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.trailerUrl = trailerUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }
}