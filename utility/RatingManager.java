package com.ilp.utility;

import com.ilp.entity.Movie;
import com.ilp.entity.MovieRating;
import com.ilp.service.BasicRatingCalculator;
import com.ilp.service.MovieRatingService;

public class RatingManager {

    public static void main(String[] args) {
        // Step 1: Create a Movie instance representing the movie "Inception" with a release year of 2010.
        Movie inceptionMovie = new Movie("Inception", 2010);

        // Step 2: Create a MovieRating instance for "Inception" with a rating of 4.5.
        MovieRating inceptionRating = new MovieRating(inceptionMovie, 4.5);

        // Step 3: Create a BasicRatingCalculator with the MovieRating.
        BasicRatingCalculator basicRatingCalculator = new BasicRatingCalculator();

        // Step 4: Create a MovieRatingService with the BasicRatingCalculator.
        MovieRatingService basicRatingService = new MovieRatingService(basicRatingCalculator);

        // Step 5: Calculate the basic rating using the MovieRatingService.
        double basicRating = basicRatingService.calculateRating(inceptionRating);

        // Step 6: Display the basic rating using the displayRating method.
        RatingManager ratingManager = new RatingManager();
        ratingManager.displayRating(inceptionRating); // Display the original rating
        System.out.println("Basic Rating: " + basicRating);
    }

    public void displayRating(MovieRating movieRating) {
        System.out.println("Movie: " + movieRating.getMovie().getTitle() +
                ", Release Year: " + movieRating.getMovie().getReleaseYear() +
                ", Rating: " + movieRating.getRating());
    }
}