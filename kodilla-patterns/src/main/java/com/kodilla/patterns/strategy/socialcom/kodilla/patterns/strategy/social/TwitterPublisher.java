package com.kodilla.patterns.strategy.socialcom.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Public on Twitter";
    }
}
