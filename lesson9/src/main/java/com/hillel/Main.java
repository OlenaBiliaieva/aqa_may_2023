package com.hillel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(7);
        Cat cat1 = new Cat(7);
        Cat cat2 = cat1;
        cat1.name = "Bonia";

        String str = "Hello!";
        String str1 = "Hello!";
        String str2 = "Hello!";
        String str3 = "hello!";

        String str4 = new String("Hello!");
        String str5 = new String("Hello!");


        str = str + " World";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);


    }
}
