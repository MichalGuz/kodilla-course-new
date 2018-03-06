package com.kodilla.good.patterns.food.to.door;

import java.util.Random;

public class ExtraFoodShop implements Producer {

    String producerName = "Extra Food Shop";

    public ExtraFoodShop(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public boolean process (User user, Product product, OrderData orderData){
        System.out.println("Extra Food Shop! \n Extra food in regular price!\n)");
        Random random = new Random();
        return random.nextBoolean();
    }


}
