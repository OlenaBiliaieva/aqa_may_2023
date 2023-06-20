package com.hillel.wineshop;

public class Gin extends AlcoholBottle {
    int year;
    String type;
    String[] ingredients;

    public Gin(int alcoholProponent, String name, int year, String type, String[] ingredients) {
        super(alcoholProponent, name);
        this.year = year;
        this.type = type;
        this.ingredients = ingredients;
    }

    public Gin(int alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public Gin() {
        super(12);
    }

}
