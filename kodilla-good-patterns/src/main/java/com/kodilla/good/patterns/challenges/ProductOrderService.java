package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService{

    @Override
    public boolean order (final User user, final Product product, final OrderData orderData) {
        System.out.println("Order number: " + orderData.getOrderNumber() + "\n"
                + "Date of placed of order: " + orderData.getDateOfOrder() + "\n"
                + "Purchaser: " + user.getNameOfUser() + "" + user.getSurnameOfUser() + ", ID of User: " + user.getIdUser() + ".\n"
                + "Details of the order:\n" + "[Product ID] " + product.getIdOfProduct()
                + "\n[Product] " + product.getNameOfProduct() + "\n[Price] " + product.getPriceOfProduct()
                + "\n[Quantity] " + orderData.getOrderedQuantityOfProduct() + "\n[Total price: ] " + orderData.getTotalPriceOfOrder());
        return true;
    }

}
