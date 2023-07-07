package com.hillel.wineshop.main.demo13;

import com.hillel.wineshop.abstractions.AlcoholBottle;
import com.hillel.wineshop.beer.Beer;
import com.hillel.wineshop.enam.ColorOfWine;
import com.hillel.wineshop.spirits.Gin;
import com.hillel.wineshop.wino.SparklingWine;

public class EqMain {
    public static void main(String[] args) {
        SparklingWine proseco = new SparklingWine(14, "Reisling", 14,  ColorOfWine.GREEN,2022, "Itaila", "Dry");
        SparklingWine proseco1 = new SparklingWine(14, "Reisling", 15, ColorOfWine.WHITE,2016,"ila", "Dry");
        System.out.println(proseco.equals(proseco1));
        String[] ingredients = {"juniper"};
        AlcoholBottle alcoholBottle = new Gin(37, null, 12, "dry", ingredients,78);

        alcoholBottle.calculatePrice();
    }
}
