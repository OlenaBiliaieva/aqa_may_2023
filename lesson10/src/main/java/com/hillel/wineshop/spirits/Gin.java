package com.hillel.wineshop.spirits;

import com.hillel.wineshop.abstractions.AlcoholBottle;

public class Gin extends AlcoholBottle {
    private int year;
    private String type;
    private String[] ingredients;

    public Gin(int alcoholProponent, String name, int year, String type, String[] ingredients) {
        super(alcoholProponent, name);
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
}
