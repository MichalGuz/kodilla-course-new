package com.kodilla.good.patterns.food.to.door;

public class OrderDto {
    User user;
    boolean ordered;

    public OrderDto(User user, boolean ordered) {
        this.user = user;
        this.ordered = ordered;
    }

    public User getUser() {
        return user;
    }

    public boolean ordered() {
        return ordered;
    }
}
