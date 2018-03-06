package com.kodilla.good.patterns.food.to.door;

public interface Producer {
    boolean process(User user, Product product, OrderData orderData);
}
