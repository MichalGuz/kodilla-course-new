package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
