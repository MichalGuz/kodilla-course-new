package com.kodilla.good.patterns.food.to.door;

public class User {
    String userName;
    String userSurname;
    String userID;

    public User(String userName, String userSurname, String userID) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserID() {
        return userID;
    }
}
