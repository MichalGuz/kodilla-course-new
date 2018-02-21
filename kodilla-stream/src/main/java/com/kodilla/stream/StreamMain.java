package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forumSelect = new Forum();
        LocalDate overTwenty = LocalDate.now().minusYears(20);

        Map<Integer, ForumUser> selection = forumSelect.getUserList().stream()
                .filter(forumUser -> forumUser.getSexUser() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(overTwenty))
                .filter(forumUser -> forumUser.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getForumUserID,ForumUser -> ForumUser));

        System.out.println("Numbers elements of list \"Selection\": " + selection.size());
            selection.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);
    }
}
