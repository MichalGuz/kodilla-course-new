package com.kodilla.good.patterns.food.to.door;

import java.util.Random;

public class GlutenFreeShop implements Producer {
    String producerName = "Gluten Free Shop";

    public GlutenFreeShop(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public boolean process (User user, Product product, OrderData orderData){
        System.out.println("\nGluten free certificated food. Safe, natural and healthy.\n)");
        Random random = new Random();
        return random.nextBoolean();
    }
}
