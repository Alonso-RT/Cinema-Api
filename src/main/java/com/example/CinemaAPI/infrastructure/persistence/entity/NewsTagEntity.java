package com.example.CinemaAPI.infrastructure.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "news_tags")
public class NewsTagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "news_id")
    private Long newsId;

    private String tag;

    public NewsTagEntity() {
    }

    public NewsTagEntity(Long id, Long newsId, String tag) {
        this.id = id;
        this.newsId = newsId;
        this.tag = tag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}