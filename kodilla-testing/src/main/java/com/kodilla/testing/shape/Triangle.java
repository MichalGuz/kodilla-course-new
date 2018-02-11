package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double c;
    private double h;

    public Triangle(double c, double h) {
        this.c = c;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return (c * h) / 2 ;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "c=" + c +
                ", h=" + h +
                '}';
    }
}
