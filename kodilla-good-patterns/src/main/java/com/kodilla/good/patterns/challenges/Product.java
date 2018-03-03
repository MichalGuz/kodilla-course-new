package com.kodilla.good.patterns.challenges;

public class Product {
    String nameOfProduct;
    String idOfProduct;
    double priceOfProduct;

    public Product(String nameOfProduct, String idOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.idOfProduct = idOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getIdOfProduct() {
        return idOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

}
