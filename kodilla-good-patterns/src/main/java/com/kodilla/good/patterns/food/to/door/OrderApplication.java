package com.kodilla.good.patterns.food.to.door;

public class OrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new FoodToDoorMailService("realjohnsmith@gmail.com"), new FoodToDoorOrderService(), new FoodToDoorOrderRepository());

        orderProcessor.orderProcess(orderRequest);
    }


}
