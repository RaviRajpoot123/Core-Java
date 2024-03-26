package com.Sample.main;

import com.Sample.model.Product;

public class orderManagement {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductNumber(1);
        product1.setProductDesc("Pen");
        product1.setProductPrice(10);


        Product product2 = new Product();
        product2.setProductNumber(2);
        product2.setProductDesc("Coke");
        product2.setProductPrice(30);


        Product product3 = new Product();
        product3.setProductNumber(3);
        product3.setProductDesc("Losit");
        product3.setProductPrice(310);


        Product product4 = new Product();
        product4.setProductNumber(4);
        product4.setProductDesc("Mango");
        product4.setProductPrice(15);
    }



}
