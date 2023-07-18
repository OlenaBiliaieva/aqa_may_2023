package com.hellel.lesson16.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        int[] arr;
        List<String> myFirstList = new ArrayList<>();
        myFirstList.add("Hello");
        myFirstList.add(" World");
        myFirstList.add(" !");
        myFirstList.add(3,"new");

//        System.out.print(myFirstList.get(0));
//        System.out.print(myFirstList.get(1));
//        System.out.print(myFirstList.get(2));

//        System.out.println();

//        myFirstList.set(0, "New Hello!");
//
//        System.out.print(myFirstList.get(0));
//        System.out.print(myFirstList.get(1));
//        System.out.print(myFirstList.get(2));
//
//        myFirstList.remove(" World");
//        System.out.print(myFirstList.get(0));
//        System.out.print(myFirstList.get(1));
//
//        System.out.println(myFirstList.size());

//        System.out.println(myFirstList.contains("New Hello!"));
//
//        System.out.println(myFirstList.isEmpty());
        printList(myFirstList);

        List<String> newArr = new ArrayList<>(myFirstList);
        System.out.println(newArr.equals(myFirstList));

        printList(newArr);

        myFirstList.add(" new");

        System.out.println(newArr.equals(myFirstList));

        printList(myFirstList);

        printList(newArr);

    }

    public static void printList(List<String> strings){
        System.out.println("____________________");
        for (String s : strings){
            System.out.print(s);
        }
        System.out.println("____________________");
    }
}