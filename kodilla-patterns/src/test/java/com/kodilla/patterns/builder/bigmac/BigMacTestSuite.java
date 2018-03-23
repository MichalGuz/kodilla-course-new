package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll("regular")
                .sauce("standard")
                .burgers(2)
                .ingredients("onion")
                .ingredients("lettuce")
                .ingredients("cheese")
                .build();
        //When

        //Then
        Assert.assertEquals(2, bigMac.getBurgers());
        Assert.assertEquals("regular", bigMac.getRoll());
        Assert.assertEquals("standard", bigMac.getSauce());
        Assert.assertEquals(3, bigMac.getIngredients().size());
        System.out.println(bigMac);
    }
}

