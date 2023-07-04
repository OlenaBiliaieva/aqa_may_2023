package com.hillel.wineshop.main.demo12;

import com.hillel.wineshop.wino.SparklingWine;
import com.hillel.wineshop.wino.Wine;

public class Main {
    public static void main(String[] args) {
//        Gin bulldog = new Gin();
//        String[] ingredients = {"juniper"};
//        Gin bulldog1 = new Gin(37,"Bulldog",12,"dry", ingredients);
//        System.out.println(bulldog1.alcoholPercent);
//        System.out.println(bulldog1.name);
//        System.out.println(bulldog1.year);
//        System.out.println(bulldog1.type);
//        System.out.println(Arrays.asList(ingredients));
//
//        Wine koblevo = new Wine(14,"Reisling","White",2013);

        Wine wine = new Wine(14, "Reisling", "White", 2013, 18);
        SparklingWine proseco = new SparklingWine(14, "Reisling", "White", 2013, "Itaila", "Dry", 18);
        wine.printLabel();
        proseco.printLabel();
        System.out.println(proseco);

        proseco.calculatePrice();

    }
}
