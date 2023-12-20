package com.java.sample.collectionsFW.interfaces.comparable.examples.e001;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    @Override
    //Comparison based on Year
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    public Movie(String name,double rating, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
