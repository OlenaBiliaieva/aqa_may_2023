package com.hillel.wineshop.main.demo14;

import com.hillel.wineshop.enam.ColorOfWine;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {

        ColorOfWine.valueOf("RED").printEnum();

        System.out.println(Arrays.toString(ColorOfWine.values()));

        System.out.println(ColorOfWine.valueOf("GREEN"));
    }
}
