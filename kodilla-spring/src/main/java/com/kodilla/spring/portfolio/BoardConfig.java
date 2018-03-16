package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    private TaskList toDoList;

    @Autowired
    private TaskList inProgressList;

    @Autowired
    private TaskList doneList;

    @Bean(name="toDoList")
    public TaskList toDoList() {
        return toDoList;
    }

    @Bean(name="inProgressList")
    public TaskList inProgressList() {
        return inProgressList;
    }

    @Bean(name="doneList")
    public TaskList doneList() {
        return doneList;
    }

    @Bean
    public Board board() {
        return new Board(toDoList(),inProgressList(),doneList());
    }
}
