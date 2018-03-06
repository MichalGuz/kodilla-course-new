package com.kodilla.good.patterns.food.to.door;

import java.util.Random;

public class HealthyShop implements Producer {
    String producerName = "Healthy Shop";

    public HealthyShop(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public boolean process (User user, Product product, OrderData orderData){
        System.out.println("Thank you for your order. \n Enjoy healthy food with Healthy Shop.\n)");
        Random random = new Random();
        return random.nextBoolean();
    }
}
