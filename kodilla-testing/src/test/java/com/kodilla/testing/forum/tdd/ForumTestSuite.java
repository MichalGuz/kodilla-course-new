package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

//Test suite for classes of Forum
public class ForumTestSuite {
    private static int testCounter = 0;

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
        System.out.println("Preparing to execute # test " + testCounter);
    }

    @Test
    public void testAddPost() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");

        // When
        forumUser.addPost("Hello everyone! Is there anyone from south-west?", "Johnny");

        // Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");
        ForumPost thePost = new ForumPost("Hello everyone! Is there anyone from south-west? ","Johnny");

        // When
        forumUser.addComment(thePost, "Thank you very much for your comments!", "Johnny");

        // Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");
        ForumPost thePost = new ForumPost("Hello everyone! Is there anyone from south-west? ","Johnny");
        forumUser.addPost(thePost.getPostBody(), thePost.getAuthor());

        // When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        // Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");
        ForumPost thePost = new ForumPost("Hello everyone! Is there anyone from south-west? ","Johnny");
        ForumComment theComment = new ForumComment(thePost, "Thank you very much for your comments!", "Johnny");
        forumUser.addComment(thePost, theComment.getCommentBody(),theComment.getAuthor());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");
        ForumPost thePost = new ForumPost("Hello everyone! Is there anyone from south-west? ","Johnny");

        // When
        boolean result = forumUser.removePost(thePost);

        // Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");
        ForumPost thePost = new ForumPost("Hello everyone! Is there anyone from south-west? ", "Johnny");
        ForumComment theComment = new ForumComment(thePost, "Thank you very much for your comments!", "Johnny");

        // When
        boolean result = forumUser.removeComment(theComment);

        // Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");
        ForumPost thePost = new ForumPost("Hello everyone! Is there anyone from south-west? ","Johnny");
        forumUser.addPost(thePost.getPostBody(), thePost.getAuthor());

        // When
        boolean result = forumUser.removePost(thePost);

        // Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        // Given
        ForumUser forumUser = new ForumUser("Johnny", "John Douglas");
        ForumPost thePost = new ForumPost("Hello everyone! Is there anyone from south-west? ","Johnny");
        ForumComment theComment = new ForumComment(thePost, "Thank you very much for your comments!", "Johnny");
        forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());

        // When
        boolean result = forumUser.removeComment(theComment);

        // Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}