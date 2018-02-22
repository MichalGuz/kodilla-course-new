package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {2,2,2,2,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        double expectedAverage = 3;
        Assert.assertEquals(expectedAverage,result,0);
        System.out.println("average = "+ result);
    }
}
