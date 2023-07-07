package com.hillel.wineshop.wino;

import com.hillel.wineshop.abstractions.AlcoholBottle;
import com.hillel.wineshop.enam.ColorOfWine;

public class Wine extends AlcoholBottle {

    private ColorOfWine color;
    private int yearOfProduction;

    public Wine(int alcoholPercent, String name, int price, ColorOfWine color, int yearOfProduction) {
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

    @Override
    public void isFilled() {
        System.out.println(getName() + " наливается вино: " + color);
    }
}
