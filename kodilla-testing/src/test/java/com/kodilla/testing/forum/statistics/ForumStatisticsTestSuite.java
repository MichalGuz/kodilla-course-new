package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        System.out.println("Preparing to execute test ");
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatistics statistics = new ForumStatistics(statisticsMock);

        // When
        statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),001);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),001);
        Assert.assertEquals(0,statistics.getAvgCommentsPerPost(),001);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),001);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),001);
        Assert.assertEquals(0,statistics.getAvgCommentsPerPost(),001);
    }

    @Test
    public void testCalculateAdvStatistics0Comments() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfComments = 0;
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),001);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),001);
        Assert.assertEquals(0,statistics.getAvgCommentsPerPost(),001);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfPosts = statisticsMock.postsCount();
        int quantityOfComments = quantityOfPosts - 1;
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),001);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),001);
        Assert.assertEquals(0,statistics.getAvgCommentsPerPost(),001);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfPosts = statisticsMock.postsCount();
        int quantityOfComments = quantityOfPosts + 1;
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),001);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),001);
        Assert.assertEquals(0,statistics.getAvgCommentsPerPost(),001);
    }

    @Test
    public void testCalculateAdvStatistics0Users() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),001);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),001);
        Assert.assertEquals(0,statistics.getAvgCommentsPerPost(),001);
    }

    @Test
    public void testCalculateAdvStatistics100Users() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for(int i=0; i<99; i++){
            String name = "name" + i;
            userNames.add(name);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),001);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),001);
        Assert.assertEquals(0,statistics.getAvgCommentsPerPost(),001);
    }
}
