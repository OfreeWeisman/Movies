package com.android.movies;

import java.net.URL;

public class Movie {
    private String title;
    private String info;
    private String description;
    private String releaseDate;
    private int rating;
    private URL image;

    public Movie(String title, String info, String description, String releaseDate, int rating, URL image) {
        this.title = title;
        this.info = info;
        this.description = description;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.image = image;
    }

    public Movie() {
        this.title = "";
        this.info = "";
        this.description = "";
        this.releaseDate = "";
        this.rating = 0;
        this.image = null;
    }
}
