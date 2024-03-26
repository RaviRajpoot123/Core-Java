package com.Sample.model;

import java.util.Date;

// This is customer Model
public class Customer {
private String name;
private String address;
private int phoneNumber;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Order addNewOrder(){
        Order order = new Order();
        order.setOrderDate(new Date());
        order.setOrderNumber(1);
        order.setAmount(order.calculateAmount(fstProduct));


        return order;
    }
}
