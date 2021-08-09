package com.springboot.basic.entity;

public class Item {
    private String name;
    private double pricePerIem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerIem() {
        return pricePerIem;
    }

    public void setPricePerIem(double pricePerIem) {
        this.pricePerIem = pricePerIem;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", pricePerIem=" + pricePerIem +
                '}';
    }
}
