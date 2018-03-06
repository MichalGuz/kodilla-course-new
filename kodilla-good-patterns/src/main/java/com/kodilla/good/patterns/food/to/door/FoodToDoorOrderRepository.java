package com.kodilla.good.patterns.food.to.door;

public class FoodToDoorOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product, OrderData orderData) {
        System.out.println("Order number: " + orderData.getOrderNumber()
                + " was saved in order repository");
        return true;
    }
}
