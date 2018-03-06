package com.kodilla.good.patterns.food.to.door;

public class Product {
    String productName;
    String productID;
    double productPrice;

    public Product(String productName, String productID, double productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
