package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jan", "Kowalski", "Kowal99", "145552114");
        Product product = new Product("Rubber yellow duck toy", "85647001863215", 4.99);
        OrderData orderData = new OrderData(LocalDate.of(2018, 2, 28), 1, "56317300532", 4.99);

        return new OrderRequest(user, product, orderData);
    }
}
