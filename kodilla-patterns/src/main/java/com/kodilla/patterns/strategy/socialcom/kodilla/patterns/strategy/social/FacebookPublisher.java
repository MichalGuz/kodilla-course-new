package com.kodilla.patterns.strategy.socialcom.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Public on Facebook";
    }
}
