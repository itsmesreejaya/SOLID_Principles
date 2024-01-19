package com.ilp.model;

import com.ilp.entity.MovieRating;

public interface RatingCalculator {
    double calculateRating(MovieRating movieRating);
}