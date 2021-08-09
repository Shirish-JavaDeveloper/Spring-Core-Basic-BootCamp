package com.springboot.basic.entity;

import java.util.List;

public class Order {
    private Customer customer;
    private double amount;
    private List<Item> itemList;

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Item> getItemsList() {
        return itemList;
    }

    public void setItemsList(List<Item> itemList) {
        this.amount = itemList.stream().mapToDouble(Item::getPricePerIem).sum();
        this.itemList = itemList;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer=" + customer.getName() +
                ", amount=" + amount +
                ", itemList=" + itemList +
                '}';
    }
}
