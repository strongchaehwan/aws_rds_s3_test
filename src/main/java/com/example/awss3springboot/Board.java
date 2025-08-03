package com.example.awss3springboot;

import jakarta.persistence.*;

@Entity
@Table(name = "boards")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String imageUrl;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Board() {
    }

    public Board(String title, String content, String imageUrl) {
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
    }
}