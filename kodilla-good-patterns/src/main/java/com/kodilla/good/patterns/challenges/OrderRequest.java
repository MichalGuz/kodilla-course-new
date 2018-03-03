package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    User user;
    Product product;
    OrderData orderData;

    public OrderRequest(User user, Product product,OrderData orderData) {
        this.user = user;
        this.product = product;
        this.orderData = orderData;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public OrderData getOrderData() {
        return orderData;
    }
}
