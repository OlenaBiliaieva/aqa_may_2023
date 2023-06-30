package com.hillel.wineshop.wino;

import com.hillel.wineshop.abstractions.AlcoholBottle;

public class Wine extends AlcoholBottle {

    private String color;
    private int yearOfProduction;

    public Wine(int alcoholPercent, String name, String color, int yearOfProduction, int price) {
        super(alcoholPercent, name, price);
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public Wine() {
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int calculatePrice() {
        int price = ((getPrice() / 100) * 10) * (2023 - yearOfProduction);
        setPrice(price);
        return price;
    }

    @Override
    public int calculatePrice(int procent) {
        int price = getPrice() + ((getPrice() / 100) * procent) * (2023 - yearOfProduction);
        setPrice(price);
        return price;
    }
}
