package com.hillel.wineshop;

public class SparklingWine extends Wine{

    String region;
    String type;

    public SparklingWine(int alcoholPercent, String name, String color, int yearOfProduction, String region, String type) {
        super(alcoholPercent, name, color, yearOfProduction);
        this.region = region;
        this.type = type;
    }

    public SparklingWine(String region, String type) {
        this.region = region;
        this.type = type;
    }
}
