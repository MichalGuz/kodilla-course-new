package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean boardExists = context.containsBean("board");
        boolean toDoListExists = context.containsBean("toDoList");
        boolean inProgressListExists = context.containsBean("toDoList");
        boolean doneListExists = context.containsBean("toDoList");
        //Then
        System.out.println("Bean board was found in the container: " + boardExists);
        System.out.println("Bean toDoList was found in the container: " + toDoListExists);
        System.out.println("Bean inProgressList was found in the container: " + inProgressListExists);
        System.out.println("Bean doneList was found in the container: " + doneListExists);
    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
            .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        TaskList toDoListOfTasks = board.getToDoList();
        TaskList inProgressListOfTasks = board.getInProgressList();
        TaskList doneListOfTasks = board.getDoneList();
        //When
        List<String> check1 = toDoListOfTasks.getTasks();
        check1.add("Task1");
        List<String> check2 = inProgressListOfTasks.getTasks();
        check2.add("Task2");
        List<String> check3 = doneListOfTasks.getTasks();
        check3.add("Task3");
        //Then
        System.out.println(check1.get(0) + "\n" + check2.get(0) + "\n" + check3.get(0));
    }

}
