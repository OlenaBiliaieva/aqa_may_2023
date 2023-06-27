package com.hillel.wineshop.wino;

public final class SparklingWine extends Wine {

    private String region;
    private String type;

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
