package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Food shopping", "bread", 1.0);
            case PAINTING:
                return new PaintingTask("Painting", "white colour", "Bathroom's door");
            case DRIVING:
                return new DrivingTask("Driving", "shopping center", "car");
            default:
                return null;
        }

    }
}
