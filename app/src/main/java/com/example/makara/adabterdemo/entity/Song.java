package com.example.makara.adabterdemo.entity;

/**
 * Created by Chan Makara on 1/24/2018.
 */

public class Song {
    private int image;
    private String title;
    private String author;
    private boolean isPlaying;

    public Song(String title, String author, boolean isPlaying) {
        this.image = image;
        this.title = title;
        this.author = author;
        this.isPlaying = isPlaying;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
