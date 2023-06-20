package com.hillel.wineshop;

public abstract class AlcoholBottle {

    int alcoholPercent;
    String name;

    public AlcoholBottle(int alcoholPercent, String name) {
        this.alcoholPercent = alcoholPercent;
        this.name = name;
    }

    public AlcoholBottle(int alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public AlcoholBottle() {
    }
}
