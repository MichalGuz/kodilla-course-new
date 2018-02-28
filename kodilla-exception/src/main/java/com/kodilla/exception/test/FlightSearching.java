package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> destinations = new HashMap<String, Boolean>();
        destinations.put("Beijing PEK", true);
        destinations.put("New York JFK", true);
        destinations.put("Doha DOH", true);
        destinations.put("Warsaw WAR", true);
        destinations.put("Naples NAP", true);
        destinations.put("Chicago ORD", true);
        destinations.put("Keflavik KEF", false);
        destinations.put("London LHR", true);
        destinations.put("London LTN", false);

        if (flight.getArrivalAirport() != flight.getDepartureAirport()) {

            if (destinations.containsKey(flight.getArrivalAirport()) && destinations.containsKey(flight.getDepartureAirport())) {

                return destinations.get(flight.getArrivalAirport());

            } else {

                throw new RouteNotFoundException();
            }

        } else {

            System.out.println("Departure and arrival destinations must be different.");

        }

        return true;
    }
}


