package com.kodilla.good.patterns.challenges;

public class OrderRepositoryProcessor implements OrderRepository{
    @Override
    public boolean createOrder(User user, Product product, OrderData orderData) {
        System.out.println("Order number: " + orderData.getOrderNumber()
        + " was saved in order repository");
        return true;
    }
}
