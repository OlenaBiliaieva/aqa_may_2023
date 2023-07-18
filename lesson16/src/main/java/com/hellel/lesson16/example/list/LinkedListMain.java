package com.hellel.lesson16.example.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add(" World");
        list.add("Hello");
        list.add(" !");

      //  list.add(0," World");

        System.out.println(list);
//        System.out.println(list.get(2));
//        list.remove(" World");
//        System.out.println(list.get(1));

        LinkedList<String> list2 = new LinkedList<>(list);

        list2.addFirst("First");
        System.out.println(list2);

    }
}
