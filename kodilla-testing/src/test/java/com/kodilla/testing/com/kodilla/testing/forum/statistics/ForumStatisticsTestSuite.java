package com.kodilla.testing.com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
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
    public void testCalculateAdvStatisticsWithMockFirst() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfPosts = 0;
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
       double resultAvgUsersPosts = statistics.getAvgUsersPosts();
       double resultAvgUsersComments = statistics.getAvgUsersComments();
       double resultAvgCommentsPerPost = statistics.getAvgCommentsPerPost();

        // Then
        Assert.assertEquals(0,resultAvgUsersPosts,001);
        Assert.assertEquals(0,resultAvgUsersComments,001);
        Assert.assertEquals(0,resultAvgCommentsPerPost,001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockSecond() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
       double resultAvgUsersPosts = statistics.getAvgUsersPosts();
       double resultAvgUsersComments = statistics.getAvgUsersComments();
       double resultAvgCommentsPerPost = statistics.getAvgCommentsPerPost();

        // Then
        Assert.assertEquals(0,resultAvgUsersPosts,001);
        Assert.assertEquals(0,resultAvgUsersComments,001);
        Assert.assertEquals(0,resultAvgCommentsPerPost,001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockThird() {
         // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfComments = 0;
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
       double resultAvgUsersPosts = statistics.getAvgUsersPosts();
       double resultAvgUsersComments = statistics.getAvgUsersComments();
       double resultAvgCommentsPerPost = statistics.getAvgCommentsPerPost();

        // Then
        Assert.assertEquals(0,resultAvgUsersPosts,001);
        Assert.assertEquals(0,resultAvgUsersComments,001);
        Assert.assertEquals(0,resultAvgCommentsPerPost,001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockFourth() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfPosts = statisticsMock.postsCount();
        int quantityOfComments = quantityOfPosts - 1;
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        double resultAvgUsersPosts = statistics.getAvgUsersPosts();
        double resultAvgUsersComments = statistics.getAvgUsersComments();
        double resultAvgCommentsPerPost = statistics.getAvgCommentsPerPost();

        // Then
        Assert.assertEquals(0,resultAvgUsersPosts,001);
        Assert.assertEquals(0,resultAvgUsersComments,001);
        Assert.assertEquals(0,resultAvgCommentsPerPost,001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockFifth() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityOfPosts = statisticsMock.postsCount();
        int quantityOfComments = quantityOfPosts + 1;
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        double resultAvgUsersPosts = statistics.getAvgUsersPosts();
        double resultAvgUsersComments = statistics.getAvgUsersComments();
        double resultAvgCommentsPerPost = statistics.getAvgCommentsPerPost();

        // Then
        Assert.assertEquals(0,resultAvgUsersPosts,001);
        Assert.assertEquals(0,resultAvgUsersComments,001);
        Assert.assertEquals(0,resultAvgCommentsPerPost,001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockSixth() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        double resultAvgUsersPosts = statistics.getAvgUsersPosts();
        double resultAvgUsersComments = statistics.getAvgUsersComments();
        double resultAvgCommentsPerPost = statistics.getAvgCommentsPerPost();

        // Then
        Assert.assertEquals(0,resultAvgUsersPosts,001);
        Assert.assertEquals(0,resultAvgUsersComments,001);
        Assert.assertEquals(0,resultAvgCommentsPerPost,001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockSeventh() {
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
        double resultAvgUsersPosts = statistics.getAvgUsersPosts();
        double resultAvgUsersComments = statistics.getAvgUsersComments();
        double resultAvgCommentsPerPost = statistics.getAvgCommentsPerPost();

        // Then
        Assert.assertEquals(0,resultAvgUsersPosts,001);
        Assert.assertEquals(0,resultAvgUsersComments,001);
        Assert.assertEquals(0,resultAvgCommentsPerPost,001);
    }

}
