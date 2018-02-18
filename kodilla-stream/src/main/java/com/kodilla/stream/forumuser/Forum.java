package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(1001,"Alan90",'M',1,5, 1990, 5));
        listOfForumUsers.add(new ForumUser(1002,"BobB",'M',21,1, 2002, 1));
        listOfForumUsers.add(new ForumUser(1003,"CecilCC",'M',11,3, 1982, 0));
        listOfForumUsers.add(new ForumUser(1004,"DarkKnight",'M',14,4, 1960, 2));
        listOfForumUsers.add(new ForumUser(1005,"East",'M',12,6, 1973, 10));
        listOfForumUsers.add(new ForumUser(1006,"Furby",'M',19,7, 1980, 4));
        listOfForumUsers.add(new ForumUser(1007,"Gigi",'F',9,9, 2001, 3));
        listOfForumUsers.add(new ForumUser(1008,"HeelBoy",'M',15,11, 2004, 6));
        listOfForumUsers.add(new ForumUser(1009,"IgorSTR",'M',20,2, 1999, 1));
        listOfForumUsers.add(new ForumUser(1010,"JaneA",'F',31,8, 1979, 3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUsers);
    }
}
