package com.kodilla.testing.com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        System.out.println("Preparing to execute test");
    }

    @Test
    public void testAddFigure() {
        //Given
        ArrayList<String>  listOfFigures = new ArrayList<String>();

        //When
        listOfFigures.add("Circle");

        //Then
        Assert.assertEquals(1, listOfFigures.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ArrayList<String> listOfFigures = new ArrayList<String>();
        listOfFigures.add("Circle");

        //When
       boolean result = listOfFigures.remove("Circle");

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, listOfFigures.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ArrayList<String> listOfFigures = new ArrayList<String>();
        Circle shape = new Circle(5.0);
        listOfFigures.add("Circle");

        //When
        String retrievedFigure;
        retrievedFigure = listOfFigures.get(0);

        //Then
        Assert.assertEquals(shape, retrievedFigure);
    }

    @Test
    public void testShowShapes() {
        //Given
        ArrayList<String> listOfFigures = new ArrayList<String>();
        Circle shape = new Circle(5.0);
        Triangle shape1 = new Triangle(4.0, 3.0);
        listOfFigures.add("Circle");
        listOfFigures.add("Triangle");
        String showFigures = null;
        for(int n=0; n < listOfFigures.size(); n++) {
            showFigures = (listOfFigures.get(n));
        }

        //When
        String result = null;
        for(int n=0; n < listOfFigures.size(); n++) {
            result = (listOfFigures.get(n));
        }

        //Then
        Assert.assertEquals(showFigures, result);
    }
}
