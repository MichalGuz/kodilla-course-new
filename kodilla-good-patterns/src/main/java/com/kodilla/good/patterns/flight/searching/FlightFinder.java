package com.kodilla.good.patterns.flight.searching;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlightFinder {

    public Map<Flight, String> getFlightsThrough(String via, String to) {

        Map<Flight, String> flights = new HashMap<Flight, String>();

            Flight flightA = new Flight("Wroclaw","Gdansk");
            Flight flightB = new Flight("Wroclaw", "Warsaw");
            Flight flightC = new Flight("Rzeszow", "Warsaw");
            Flight flightD = new Flight("Poznan", "Krakow");
            Flight flightE = new Flight("Poznan", "Warsaw");
            Flight flightF = new Flight("Warsaw", "Gdansk");
            Flight flightG = new Flight("Wroclaw", "Warsaw");
            Flight flightH = new Flight("Krakow", "Warsaw");
            Flight flightI = new Flight("Krakow", "Gdansk");

            flights.put(flightA, "morning");
            flights.put(flightB, "morning");
            flights.put(flightC, "morning");
            flights.put(flightD, "morning");
            flights.put(flightE, "morning");
            flights.put(flightF, "evening");
            flights.put(flightG, "evening");
            flights.put(flightH, "evening");
            flights.put(flightI, "morning");

            Map<Flight,String> result1 = flights.entrySet().stream()
                    .map(f -> f.getKey())
                    .filter(fl -> fl.getVia().equals(via))
                    .collect(Collectors.toMap(f -> f, flights.values()));

            Map<Flight, String> result2 = flights.entrySet().stream()
                    .filter(fl -> fl.getKey().getTo().equals(to))
                    .collect(Collectors.toMap(fl -> fl, flights.values()));

            result1.putAll(result2);
            return result1;
    }
}
