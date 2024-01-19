package com.ilp.entity;

public class MovieRating {
    private Movie movie;
    private double rating;

    public MovieRating(Movie movie, double rating) {
        this.movie = movie;
        this.rating = rating;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getRating() {
        return rating;
    }
}
