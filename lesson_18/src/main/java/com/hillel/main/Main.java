package com.hillel.main;

import com.hillel.funcInterface.PrintSmth;
import com.hillel.person.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Netty");
//
//        for (String s : list) {
//            System.out.println(s);
//        }

        String str = "Hello World!";
        PrintSmth printSmth = new PrintSmth() {
            @Override
            public void printString(String str) {
                System.out.println(str);
            }
        };

        PrintSmth printSmth2 = str2 -> System.out.println(str2);

        printSmth.printString(str);

        // list.forEach(str1 -> System.out.println(str1));
    }
}
