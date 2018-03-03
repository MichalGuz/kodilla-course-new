package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderData {
    LocalDate dateOfOrder;
    int orderedQuantityOfProduct;
    String orderNumber;
    double totalPriceOfOrder;

    public OrderData(LocalDate dateOfOrder, int orderedQuantityOfProduct, String orderNumber, double totalPriceOfOrder) {
        this.dateOfOrder = dateOfOrder;
        this.orderedQuantityOfProduct = orderedQuantityOfProduct;
        this.orderNumber = orderNumber;
        this.totalPriceOfOrder = totalPriceOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public int getOrderedQuantityOfProduct() {
        return orderedQuantityOfProduct;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public double getTotalPriceOfOrder() {
        return totalPriceOfOrder;
    }
}
