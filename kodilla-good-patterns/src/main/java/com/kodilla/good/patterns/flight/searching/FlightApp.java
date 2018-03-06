package com.kodilla.good.patterns.flight.searching;

import java.util.Map;

public class FlightApp {

    public static void main(String[] args) {

        FlightFinder searching = new FlightFinder();
        Map<Flight, String> result = searching.getFlightsThrough("Wroclaw","Gdansk");
        System.out.println(result);
    }


}

