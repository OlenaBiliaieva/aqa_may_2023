package com.hillel.wineshop.beer;

import com.hillel.wineshop.abstractions.AlcoholBottle;

public class Beer extends AlcoholBottle {

    private boolean penka;
    private final static boolean BUBBLES_BEER = true;

    public Beer(int alcoholPercent, String name, boolean penka) {
        super(alcoholPercent, name);
        setPenka(penka);
    }

    public void setPenka(boolean bol) {
        this.penka = bol;
    }

    public boolean getPenka() {
        return penka;
    }

    public void printBeer() {
        System.out.println("is with penka " + penka);
    }

    public boolean getBubblesBeer() {
        return BUBBLES_BEER;
    }
}
