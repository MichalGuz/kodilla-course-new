package com.kodilla.good.patterns.flight.searching;

import java.util.Objects;

public class Flight {
    String via;
    String to;

    public Flight(String via,  String to) {
        this.via = via;
        this.to = to;
    }

    public String getVia() {
        return via;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(via, flight.via) &&
                Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {

        return Objects.hash(via, to);
    }
}
