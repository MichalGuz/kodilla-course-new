package com.kodilla.good.patterns.food.to.door;

public class FoodToDoorOrderService implements OrderService {

    public static final String HEALTHY_SHOP = "Healthy Shop";
    public static final String GLUTEN_FREE_SHOP = "Gluten Free Shop";
    public static final String EXTRA_FOOD_SHOP = "Extra Food Shop";

    @Override
    public boolean order (final String producer, final User user, final Product product, final OrderData orderData) {
        System.out.println("Order number: " + orderData.getOrderNumber() + "\n"
                + "Purchaser: " + user.getUserName() + " " + user.getUserSurname() + ", ID of User: " + user.getUserID() + ".\n"
                + "Details of the order:\n" + "[Product ID] " + product.getProductID()
                + "\n[Product] " + product.getProductName() + "\n[Producer] " + orderData.getProducerName()
                + "\n[Quantity] " + orderData.getOrderedQuantityOfProduct());
        Producer theProducer = null;
        switch(producer){
            case HEALTHY_SHOP: theProducer = new HealthyShop(producer);
            break;
            case GLUTEN_FREE_SHOP: theProducer = new GlutenFreeShop(producer);
            break;
            case EXTRA_FOOD_SHOP: theProducer = new ExtraFoodShop(producer);
            break;
        }
        return theProducer.process(user,product, orderData);
    }

}