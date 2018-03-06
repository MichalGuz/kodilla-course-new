package com.kodilla.good.patterns.food.to.door;

public interface OrderService {
    boolean order(String producer, User user, Product product, OrderData orderData);
}
