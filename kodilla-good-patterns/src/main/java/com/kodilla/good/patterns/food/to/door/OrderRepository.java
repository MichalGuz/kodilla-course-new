package com.kodilla.good.patterns.food.to.door;

public interface OrderRepository {
    boolean createOrder(User user, Product product, OrderData orderData);
}
