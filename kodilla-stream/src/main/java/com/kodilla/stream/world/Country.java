package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleOfCountry;
    private final String nameOfCountry;

    public Country(final BigDecimal peopleOfCountry, final String nameOfCountry) {
        this.peopleOfCountry = peopleOfCountry;
        this.nameOfCountry = nameOfCountry;
    }

    public BigDecimal getPeopleOfCountry() {
        return peopleOfCountry;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }
}
