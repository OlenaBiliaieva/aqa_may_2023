package com.hillel.wineshop.wino;

public final class SparklingWine extends Wine {

    private String region;
    private String type;

    public SparklingWine(int alcoholPercent, String name, String color, int yearOfProduction, String region, String type, int price) {
        super(alcoholPercent, name, color, yearOfProduction, price);
        this.region = region;
        this.type = type;
    }

    public SparklingWine(String region, String type) {
        this.region = region;
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public String getType() {
        return type;
    }

    @Override
    public void printLabel() {
        System.out.println(String.format("Name %s , Price %d ,  Region %s", getName(), getPrice(), region));
    }

    @Override
    public String toString() {
        return "SparklingWine{" +
                "region='" + region + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    //    @Override
//    public int calculatePrice() {
//        int price = ((getPrice() / 100) * 5) * (2023 - this.getYearOfProduction());
//        setPrice(price);
//        return price;
//    }

    @Override
    public boolean equals(Object object) {
        SparklingWine sparklingWine = (SparklingWine) object;
        return
                this.getPrice() == sparklingWine.getPrice()
                && this.getYearOfProduction() == sparklingWine.getYearOfProduction()
                && this.getName().equals(sparklingWine.getName())
                && this.type.equals(sparklingWine.getType())
                && this.region.equals(sparklingWine.getRegion());

    }
}
