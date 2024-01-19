package com.ilp.service;

import com.ilp.entity.MovieRating;
import com.ilp.model.RatingCalculator;

public class BasicRatingCalculator implements RatingCalculator {
    @Override
    public double calculateRating(MovieRating movieRating) {
        // Basic rating calculation logic
        return movieRating.getRating() * 1.2;
    }
}