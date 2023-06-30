package com.hillel.wineshop.spirits;

import com.hillel.wineshop.abstractions.AlcoholBottle;

public class Gin extends AlcoholBottle {
    private int year;
    private String type;
    private String[] ingredients;

    public Gin(int alcoholProponent, String name, int year, String type, String[] ingredients, int price) {
        super(alcoholProponent, name, price);
        this.year = year;
        this.type = type;
        this.ingredients = ingredients;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        } else {
            System.out.println("You are trying to set null");
        }
    }

    @Override
    protected int calculatePrice() {
        int price = ((getPrice() / 100) * 12) * (year);
        setPrice(price);
        return price;
    }

    @Override
    public int calculatePrice(int procent) {
        int price = getPrice() + ((getPrice() / 100) * procent) * (year);
        setPrice(price);
        return price;
    }
}
