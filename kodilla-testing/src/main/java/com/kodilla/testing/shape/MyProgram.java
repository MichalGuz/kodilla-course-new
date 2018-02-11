package com.kodilla.testing.shape;

public class MyProgram {
    public static void main(String[] args) {
        ShapeCollector sc = new ShapeCollector();
        sc.addFigure(new Circle(5.0));
        sc.addFigure(new Triangle(2.0,3));
        sc.addFigure(new Square(3));
        sc.addFigure(new Square(4));
        sc.showFigures();
    }
}
