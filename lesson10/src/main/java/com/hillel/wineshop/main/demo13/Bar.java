package com.hillel.wineshop.main.demo13;

import com.hillel.wineshop.abstractions.AlcoholBottle;
import com.hillel.wineshop.beer.Beer;
import com.hillel.wineshop.enam.ColorOfWine;
import com.hillel.wineshop.personal.Barmen;
import com.hillel.wineshop.spirits.Gin;
import com.hillel.wineshop.wino.SparklingWine;

public class Bar {

    public static void main(String[] args) {
        SparklingWine proseco = new SparklingWine(14, "Reisling", 18, ColorOfWine.WHITE, 2029, "Itaila", "Dry");

        String[] ingredients = {"juniper"};
        AlcoholBottle alcoholBottle = new Gin(37, "Gin", 12, "dry", ingredients, 78);

        Beer beer = new Beer(4, "corona", true, 12);

        Barmen barmen = new Barmen();

        barmen.fill(beer);
        barmen.fill(proseco);
        barmen.fill(alcoholBottle);

    }
}
