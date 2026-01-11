package com.example.CinemaAPI.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "news")
public class NewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "img_url")
    private String imgUrl;

    private LocalDate date;

    private String author;

    @Column(columnDefinition = "TEXT")
    private String content;

    @OneToMany
    @JoinColumn(name = "news_id")
    private List<NewsTagEntity> tags;

    public NewsEntity() {
    }

    public NewsEntity(
            Long id,
            String title,
            String description,
            String imgUrl,
            LocalDate date,
            String author,
            String content
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
        this.date = date;
        this.author = author;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<NewsTagEntity> getTags() {
        return tags;
    }

    public void setTags(List<NewsTagEntity> tags) {
        this.tags = tags;
    }
}