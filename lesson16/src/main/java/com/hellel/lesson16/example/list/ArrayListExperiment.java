package com.hellel.lesson16.example.list;

import java.util.ArrayList;
import java.util.List;

import static com.hellel.lesson16.example.list.ArrayListMain.printList;

public class ArrayListExperiment {
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList<>();
        myFirstList.add("Hello");
        myFirstList.add(" World");
        myFirstList.add(" !");
        myFirstList.add("Hello");

        myFirstList.remove("Hello");

        printList(myFirstList);
    }
}
