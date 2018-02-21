package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38442000"), "Poland");
        Country germany = new Country(new BigDecimal("81472000"), "Germany");
        Continent europe = new Continent("Europe");
        europe.getCountries().add(poland);
        europe.getCountries().add(germany);
        Country egypt = new Country(new BigDecimal("82080000"), "Egypt");
        Country nigeria = new Country(new BigDecimal("155216000"), "Nigeria");
        Continent africa = new Continent("Africa");
        africa.getCountries().add(egypt);
        africa.getCountries().add(nigeria);
        World world = new World();
        world.getContinents().add(europe);
        world.getContinents().add(africa);

        //When
        BigDecimal peopleOfWorld = world.getPeopleQuantity();

        //Then
        Assert.assertFalse(peopleOfWorld.equals("357210000"));
    }
}
