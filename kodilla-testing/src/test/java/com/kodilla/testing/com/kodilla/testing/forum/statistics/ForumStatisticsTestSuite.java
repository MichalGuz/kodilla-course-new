package com.kodilla.testing.com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

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
        System.out.println("Preparing to execute # test ");
    }

    @Test
    public void testCalculateAdvStatisticsWithMockFirst() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatistics statistics;
        statistics = new ForumStatistics(statisticsMock);

        // When
        int postsQuantity = statistics.calculateAdvStatistics();

        // Then
        Assert.assertEquals(0, postsQuantity);

    }

}
