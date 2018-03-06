package com.kodilla.good.patterns.food.to.door;

import java.time.LocalDate;

public class OrderData {
    String producerName;
    LocalDate dateOfOrder;
    int orderedQuantityOfProduct;
    String orderNumber;

    public OrderData(String producerName, LocalDate dateOfOrder, int orderedQuantityOfProduct, String orderNumber) {
        this.producerName = producerName;
        this.dateOfOrder = dateOfOrder;
        this.orderedQuantityOfProduct = orderedQuantityOfProduct;
        this.orderNumber = orderNumber;

    }

    public String getProducerName() {
        return producerName;
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

}
