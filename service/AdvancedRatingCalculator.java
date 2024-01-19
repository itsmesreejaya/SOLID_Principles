package com.ilp.service;

import com.ilp.entity.MovieRating;
import com.ilp.model.RatingCalculator;

public class AdvancedRatingCalculator implements RatingCalculator {
    @Override
    public double calculateRating(MovieRating movieRating) {
        // Advanced rating calculation logic
        return movieRating.getRating() * 1.5;
    }
}