package com.kodilla.good.patterns.food.to.door;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("John", "Smith", "1000001");
        Product product = new Product("Raspberry Extra Jam", "100001", 9.99);
        OrderData orderData = new OrderData("Extra Food Shop", LocalDate.of(2018, 2, 28), 1, "1235");

        return new OrderRequest(user, product, orderData);
    }
}
