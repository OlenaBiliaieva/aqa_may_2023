package com.hillel.wineshop.main;

import com.hillel.wineshop.wino.SparklingWine;

public class EqMain {
    public static void main(String[] args) {
        SparklingWine proseco = new SparklingWine(14, "Reisling", "White", 2013, "Itaila", "Dry", 18);
        SparklingWine proseco1 = new SparklingWine(14, "Reisling", "White", 2013, "Itaila", "Dry", 18);
        System.out.println(proseco.equals(proseco1));
    }
}
