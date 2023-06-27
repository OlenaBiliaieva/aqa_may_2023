package com.hillel.wineshop.abstractions;

public abstract class AlcoholBottle {

    private int alcoholPercent;
    private String name;

    public AlcoholBottle(int alcoholPercent, String name) {
        this.alcoholPercent = alcoholPercent;
        setName(name);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name can not be null!");

        }
    }

    public AlcoholBottle() {
    }
}
