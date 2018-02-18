package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int forumUserID;
    final String nameUser;
    final char sexUser;
    final LocalDate birthDate;
    final int postsNumber;

    public ForumUser(final int forumUserID, final String nameUser, final char sexUser, final int dayOfBirth, final int monthOfBirth, final int yearOfBirth, final int postsNumber) {
        this.forumUserID = forumUserID;
        this.nameUser = nameUser;
        this.sexUser = sexUser;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSexUser() {
        return sexUser;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getForumUserID() {
        return forumUserID;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "forumUserID=" + forumUserID +
                ", nameUser='" + nameUser + '\'' +
                ", sexUser=" + sexUser +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
