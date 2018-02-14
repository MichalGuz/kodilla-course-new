package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

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
        Shape circle = new Circle(5.0);
        ShapeCollector sc = new ShapeCollector();

        //When
        sc.addFigure(circle);

        //Then
        Shape result = sc.getFigure(0);
        Assert.assertNotNull(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle = new Circle(5.0);
        ShapeCollector sc = new ShapeCollector();
        sc.addFigure(circle);

        //When
        sc.removeFigure(circle);

        //Then
        int size = sc.getSize();
        Assert.assertEquals(0,size);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle(5.0);
        ShapeCollector sc = new ShapeCollector();
        sc.addFigure(circle);

        //When
        Shape other;
        other = sc.getFigure(0);

        //Then
        Assert.assertEquals(circle, other);
    }

}
