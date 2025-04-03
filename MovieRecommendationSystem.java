package com.movie.recommendation;

import java.util.*;
import java.util.stream.Collectors;

class Movie {
    String title;
    double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}

public class MovieRecommendationSystem {
    private List<Movie> movies;

    public MovieRecommendationSystem() {
        movies = new ArrayList<>(Arrays.asList(
            new Movie("Inception", 8.8),
            new Movie("Interstellar", 8.6),
            new Movie("The Dark Knight", 9.0),
            new Movie("Tenet", 7.5)
        ));
    }

    // Recommend top-rated movies
    public List<String> recommendMovies() {
        return movies.stream()
                     .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                     .limit(3)
                     .map(Movie::getTitle)
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MovieRecommendationSystem system = new MovieRecommendationSystem();
        System.out.println("Top Recommended Movies: " + system.recommendMovies());
    }
}
