package com.hillel.wineshop.wino;

import com.hillel.wineshop.abstractions.AlcoholBottle;

public class Wine extends AlcoholBottle {

    private String color;
    private int yearOfProduction;

    public Wine(int alcoholPercent, String name, String color, int yearOfProduction) {
        super(alcoholPercent, name);
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public Wine() {
    }
}
