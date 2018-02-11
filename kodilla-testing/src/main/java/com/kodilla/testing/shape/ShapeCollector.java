package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> listOfFigures;
    private ArrayList<Shape> secondListOfFigures;

    public ShapeCollector() {
        listOfFigures = new ArrayList<>();
        secondListOfFigures = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
       listOfFigures.add(shape);
    }

    public void addFigureToSecond(Shape shape) {
        secondListOfFigures.add(shape);
    }

    public void removeFigure(Shape shape) {
        listOfFigures.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfFigures.get(n);
    }

   public void showFigures() {
       for(Shape shape: listOfFigures){
           System.out.println(shape);
           System.out.println("Area: " + shape.getArea());
       }
    }

    public int getSize(){
        return listOfFigures.size();
    }
}
