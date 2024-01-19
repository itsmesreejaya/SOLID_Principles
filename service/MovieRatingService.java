package com.ilp.service;

import com.ilp.entity.MovieRating;
import com.ilp.model.RatingCalculator;

public class MovieRatingService {
    private RatingCalculator ratingCalculator;

    public MovieRatingService(RatingCalculator ratingCalculator) {
        this.ratingCalculator = ratingCalculator;
    }

    public double calculateRating(MovieRating movieRating) {
        return ratingCalculator.calculateRating(movieRating);
    }
}