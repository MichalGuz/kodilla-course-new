package com.kodilla.patterns.strategy.socialcom.kodilla.patterns.strategy.social;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
