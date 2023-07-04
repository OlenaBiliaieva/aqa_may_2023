package com.hillel.wineshop.beer;

import com.hillel.wineshop.abstractions.AlcoholBottle;

public class Beer extends AlcoholBottle {

    private boolean penka;
    private final static boolean BUBBLES_BEER = true;

    public Beer(int alcoholPercent, String name, boolean penka, int price) {
        super(alcoholPercent, name, price);
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

    @Override
    public int calculatePrice() {
        return this.getPrice();
    }

    @Override
    public int calculatePrice(int procent) {
        return this.getPrice();
    }

    @Override
    public void isFilled() {
        System.out.println(getName() + " наливается с пенкой: " + penka);
    }

}
