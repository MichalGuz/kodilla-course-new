package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void startTest(){
        System.out.println("Start test");
    }

    @After
    public void stopTest(){
        System.out.println("Stop test");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //given
        ArrayList<Integer> theList = new ArrayList<>();
        OddNumbersExterminator on = new OddNumbersExterminator();

        //when
        ArrayList<Integer> result = on.exterminate(theList);

        //then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        //given
        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(3);
        theList.add(2);
        theList.add(11);
        theList.add(25);
        theList.add(5);
        theList.add(6);
        theList.add(13);
        theList.add(31);
        theList.add(32);
        OddNumbersExterminator on = new OddNumbersExterminator();

        //when
        ArrayList<Integer> result = on.exterminate(theList);

        //then
        Assert.assertEquals(3, result.size());
    }
}
