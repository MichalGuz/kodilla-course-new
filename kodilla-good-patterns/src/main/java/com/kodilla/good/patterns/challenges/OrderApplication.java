package com.kodilla.good.patterns.challenges;

public class OrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService("kowal99@adres.com"), new ProductOrderService(), new OrderRepositoryProcessor());

        orderProcessor.process(orderRequest);
    }
}
