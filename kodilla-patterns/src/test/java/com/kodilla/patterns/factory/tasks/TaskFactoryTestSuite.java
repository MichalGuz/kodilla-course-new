package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Food shopping", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        drivingTask.executeTask();
    }
}
