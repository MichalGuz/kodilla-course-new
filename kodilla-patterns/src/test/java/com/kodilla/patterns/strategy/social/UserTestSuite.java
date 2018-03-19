package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.socialcom.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User martin = new Millenials("Marcin Kowalski");
        User julia = new YGeneration("Julia Malinowska");
        User alan = new ZGeneration("Alan Nowak");

        //When
        String martinSharePost = martin.sharePost();
        System.out.println("Marcin is sending post: " + martinSharePost);
        String juliaSharePost = julia.sharePost();
        System.out.println("Julia is sending post: " + juliaSharePost);
        String alanSharePost = alan.sharePost();
        System.out.println("Alan is sending post: " + alanSharePost);

        //Then
        Assert.assertEquals("Public on Facebook", martinSharePost);
        Assert.assertEquals("Public on Twitter", juliaSharePost);
        Assert.assertEquals("Send via Snapchat", alanSharePost);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User julia = new YGeneration("Julia Malinowska");

        //When
        String juliaSharePost = julia.sharePost();
        System.out.println("Julia is sending post: " + juliaSharePost);
        julia.setSharePost(new FacebookPublisher());
        juliaSharePost = julia.sharePost();
        System.out.println("Julia is sending new post: " + juliaSharePost);

        //Then
        Assert.assertEquals("Public on Facebook", juliaSharePost);
    }
}
