package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;
    private static final String DESCRIPTION = "some descritpion";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Name of TaskList #1",DESCRIPTION);
        taskListDao.save(taskList);
        String taskListName  = taskList.getListName();

        //When
        List<TaskList> listOfTaskList = taskListDao.findAllByListName(taskListName);

        //Then
        Assert.assertEquals(1, listOfTaskList.size());

        //CleanUp
        int id = taskList.getId();
        taskListDao.delete(id);
    }
}
