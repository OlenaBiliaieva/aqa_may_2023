package com.hillel.strings;

import java.util.Locale;

public class MainStringReplace {
    public static void main(String[] args) {
        String k = "_Hello";
        String m = k.replace('_', ' ').trim();
//        System.out.println("Hello".equalsIgnoreCase("hello"));
//        System.out.println(m);

        String price = "670 $";
        System.out.println(price.endsWith("670"));
        System.out.println(price.startsWith("6"));

        char[] priceChar = {'6', '7', '0', ' ', '$'};
        char[] priceChar1 = {' ', '$'};
        char[] priceChar2 = {'6'};

        String price1 = "670 $";
        if (price1.contains("$")) {
            char usd = price1.charAt(price1.indexOf('$'));
            System.out.println(usd);
        }
        price1.toLowerCase(); // к нижнему
        price1.toUpperCase(); // к верхнему

        price1.substring(0, 5);// substring по индексу


        String[] strings = "Hello fff hjhjhjh".split(" ");
    }

    private static void isStringEndsWithJava(String k){
        System.out.println(k.endsWith("Java"));
    }

    private static void isEndsWith(String str){
        System.out.println(str.charAt(str.length()-1));
    }
}
