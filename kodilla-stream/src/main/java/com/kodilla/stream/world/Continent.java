package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String nameOfContinent;
    private final List<Country> countries = new ArrayList<>();

   public Continent(String nameOfContinent) {
       this.nameOfContinent = nameOfContinent;
   }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
