package com.java.sample.collectionsFW.interfaces.comparable.examples.e001;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieDemo {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Force Awakens", 8.3, 2015));
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movies.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(movies);
        System.out.println("------------Sorted By Year---------");
            print(movies);
        System.out.println("-----------Sorted By rating-----------");
        RatingComparator ratingComparator = new RatingComparator();
        Collections.sort(movies, ratingComparator);
        print(movies);

    }

    public static void print(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

    }
}
