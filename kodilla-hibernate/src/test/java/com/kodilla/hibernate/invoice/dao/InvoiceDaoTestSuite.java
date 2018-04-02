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
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Mouse");
        Product product2 = new Product("Keyboard");
        Product product3 = new Product("USB cable");

        Item item1 = new Item(new BigDecimal(49.99), 1, new BigDecimal(49.99));
        Item item2 = new Item(new BigDecimal(69.99), 1, new BigDecimal(69.99));
        Item item3 = new Item(new BigDecimal(9.99), 5, new BigDecimal(49.95));

        String number = "0003/ExampleInvoice";
        Invoice invoice = new Invoice(number);
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
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int invoiceId = invoice.getId();
        int retrievedId = invoiceDao.findFirstByNumber(number).getId();

        //Then
        Assert.assertEquals(invoiceId, retrievedId);

        //
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
