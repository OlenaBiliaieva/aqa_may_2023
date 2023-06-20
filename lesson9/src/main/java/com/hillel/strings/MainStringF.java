package com.hillel.strings;

public class MainStringF {
    public static void main(String[] args) {
        String k = "Hello";
        int x = 10;

        System.out.println(k + " times !");
        String print = String.format("%s %d times %c", k, x , '!');
        System.out.println(print);

    }
}
