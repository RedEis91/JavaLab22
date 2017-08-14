package com.userdate.controller;

/**
 * Created by Jared on 8/14/17.
 */
public class Item {
    private String name;
    private String description;
    private int quantity;
    private float price;

    public Item(String name, String description, int quantity, float price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public Item() {
        this.name = "";
        this.description = "";
        this.quantity = 0;
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
