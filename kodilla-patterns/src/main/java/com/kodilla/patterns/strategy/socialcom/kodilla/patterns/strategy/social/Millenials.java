package com.kodilla.patterns.strategy.socialcom.kodilla.patterns.strategy.social;

public class Millenials extends User{
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
