package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    Statistics statistics;

    /* public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

   */

    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    double avgUsersPosts;
    double avgUsersComments;
    double avgCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.quantityOfUsers = quantityOfUsers;
        this.quantityOfPosts = quantityOfPosts;
        this.quantityOfComments = quantityOfComments;
        this.avgUsersPosts = avgUsersPosts;
        this.avgUsersComments = avgUsersComments;
        this.avgCommentsPerPost = avgCommentsPerPost;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public double getAvgUsersPosts() {
        return avgUsersPosts;
    }

    public double getAvgUsersComments() {
        return avgUsersComments;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "statistics=" + statistics +
                ", quantityOfUsers=" + quantityOfUsers +
                ", quantityOfPosts=" + quantityOfPosts +
                ", quantityOfComments=" + quantityOfComments +
                ", avgUsersPosts=" + avgUsersPosts +
                ", avgUsersComments=" + avgUsersComments +
                ", avgCommentsPerPost=" + avgCommentsPerPost +
                '}';
    }

    public void calculateAdvStatistics() {
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        avgUsersPosts = quantityOfPosts / quantityOfUsers;
        avgUsersComments = quantityOfComments / quantityOfUsers;
        avgCommentsPerPost = quantityOfComments / quantityOfPosts;
    }

    public void ShowStatistics() {
        System.out.println("Forum statistics:\n" +
                " quantity of users is " + quantityOfUsers + ",\n quantity of posts is " + quantityOfPosts +
                ",\n quantity of comments is " + quantityOfComments + ",\n average posts per user is " + avgUsersPosts +
                ",\n average comments per users is " + avgUsersComments + ",\n average comments per post is " + avgCommentsPerPost);
    }
}
