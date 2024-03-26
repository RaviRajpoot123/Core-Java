package com.Sample.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderNumber;
    private Date orderDate;
    private double amount;


    public void addProduct(){
        List<Product> listProduct = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double calculateAmount(List<Product> fstProduct){
        double amount = getAmount();

        for (Product p : fstProduct){
            amount += p.getProductPrice();
        }setAmount(amount);
        return amount;

    }

    public void addProduct(List<Product> fstProduct){
        calculateAmount(fstProduct);
    }
}
