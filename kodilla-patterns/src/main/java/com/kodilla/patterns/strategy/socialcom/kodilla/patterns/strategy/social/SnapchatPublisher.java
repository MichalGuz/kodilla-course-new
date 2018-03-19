package com.kodilla.patterns.strategy.socialcom.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Send via Snapchat";
    }
}
