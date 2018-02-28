package com.kodilla.good.patterns.challenges;

public class MovieTitlesPrinter {
    public static void main(String[] args) {
        MovieStore movieTitles = new MovieStore();
        movieTitles.getMovies().values().stream()
                .flatMap(m -> m.stream())
                .map(m -> m + " !")
                .forEach(System.out::println);
    }
}
