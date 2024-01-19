package com.ilp.model;

import com.ilp.entity.MovieRating;

public interface RatingOperations {
    void rateMovie(User user, MovieRating movieRating);
    void editRating(User user, MovieRating movieRating);
    void removeRating(User user, MovieRating movieRating);
}
