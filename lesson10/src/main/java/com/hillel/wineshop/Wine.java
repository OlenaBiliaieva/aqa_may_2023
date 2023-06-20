package com.hillel.wineshop;

public class Wine extends AlcoholBottle {

    String color;
    int yearOfProduction;

    public Wine(int alcoholPercent, String name, String color, int yearOfProduction) {
        super(alcoholPercent, name);
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public Wine() {

    }
}
