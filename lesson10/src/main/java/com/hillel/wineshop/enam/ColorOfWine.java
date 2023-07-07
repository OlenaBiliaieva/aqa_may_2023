package com.hillel.wineshop.enam;

public enum ColorOfWine {

    RED("Red"),
    WHITE("White"),
    ROSE,
    ORANGE,
    GREEN;

    private String name;

    public String getName() {
        return name;
    }

    ColorOfWine(String name) {
        this.name = name;
    }

    ColorOfWine() {
    }

    @Override
    public String toString() {
        return "ColorOfWine{" +
                "name='" + name + '\'' +
                '}';
    }

    public void printEnum(){
        System.out.println("name: " + name);
    }

}
