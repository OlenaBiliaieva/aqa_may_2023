package com.hillel.wineshop.main.demo12;

import com.hillel.wineshop.enam.ColorOfWine;
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

        Wine wine = new Wine(14, "Reisling", 12, ColorOfWine.RED, 18);
        Wine wine1 = new Wine(14, "Reisling", 12, ColorOfWine.RED, 18);
        Wine wine3 = new Wine(14, "Reisling", 12, ColorOfWine.RED, 18);
        SparklingWine proseco = new SparklingWine(14, "Reisling", 23, ColorOfWine.WHITE, 2022, "Italy", "dry");
        wine.printLabel();
        proseco.printLabel();
        System.out.println(proseco);

        proseco.calculatePrice();

    }
}
