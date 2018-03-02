package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieTitlesPrinter {
    public static void main(String[] args) {
        MovieStore movieTitles = new MovieStore();
        String result = movieTitles.getMovies().values().stream()
                .flatMap(m -> m.stream())
                .collect(Collectors.joining("! ","\n", "\n"  ));

        System.out.println(result);
    }
}
