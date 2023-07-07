package com.hillel.wineshop.main.demo14;

import com.hillel.wineshop.enam.ColorOfWine;

public class Main {
    public static void main(String[] args) {
        System.out.println(ColorOfWine.RED.getName());
        System.out.println(ColorOfWine.WHITE.getName());

        System.out.println(ColorOfWine.RED);
        System.out.println(ColorOfWine.WHITE);

        System.out.println(ColorOfWine.RED.equals(ColorOfWine.RED));

        ColorOfWine.RED.printEnum();
    }
}
