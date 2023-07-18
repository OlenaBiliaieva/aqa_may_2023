package com.hellel.lesson16.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("BN");
        list.add("AB");
        list.add("LN");
        Collections.sort(list);
        System.out.println(list);
    }
}
