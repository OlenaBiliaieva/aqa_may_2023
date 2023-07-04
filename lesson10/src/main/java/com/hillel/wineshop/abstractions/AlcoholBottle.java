package com.hillel.wineshop.abstractions;

public abstract class AlcoholBottle {
    private int alcoholPercent;
    private String name;
    private int price;

    public AlcoholBottle(int alcoholPercent, String name, int price) {
        this.alcoholPercent = alcoholPercent;
        this.price = price;
        setName(name);
    }

    public AlcoholBottle() {
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name can not be null!");

        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int calculatePrice();

    protected abstract int calculatePrice(int procent);

    public abstract void isFilled();

    public void printLabel() {
        System.out.println(String.format("Name %s , Price %d", name, price));
    }

}
