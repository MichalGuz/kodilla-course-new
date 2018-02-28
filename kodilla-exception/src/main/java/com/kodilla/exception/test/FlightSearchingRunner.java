package com.kodilla.exception.test;

public class FlightSearchingRunner {
    public static void main(String[] args) {

        Flight firstFlight = new Flight("Doha DOH", "Warsaw WAR");
        FlightSearching searching = new FlightSearching();

        try {
            boolean result = searching.findFlight(firstFlight);
            System.out.println("\n Found flight: " + result + "\n");

        } catch (RouteNotFoundException e) {
            System.out.println("\nNothing found. Please check searching data.\n");
        }

        finally {
            System.out.println("\nFly with us! Thank you for you visit.");
        }
    }
}
