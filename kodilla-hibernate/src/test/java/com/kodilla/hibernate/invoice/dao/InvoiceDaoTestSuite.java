package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Mouse");
        Product product2 = new Product("Keyboard");
        Product product3 = new Product("USB cable");

        Item item1 = new Item(new BigDecimal(49.99), 1, new BigDecimal(49.99));
        Item item2 = new Item(new BigDecimal(69.99), 1, new BigDecimal(69.99));
        Item item3 = new Item(new BigDecimal(9.99), 5, new BigDecimal(49.95));

        Invoice invoice = new Invoice("0000/ExampleInvoice");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertEquals(1, invoiceId);
    }
}
