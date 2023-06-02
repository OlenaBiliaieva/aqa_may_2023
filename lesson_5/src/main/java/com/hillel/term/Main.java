package com.hillel.term;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        String output;
        if (x > 0) {
            output = "x больше нуля";
        } else {
            output = "x меньше нуля";
        }

        output = x > 0 ? "x больше нуля" : "x меньше нуля";

        System.out.println(output);
    }
}
