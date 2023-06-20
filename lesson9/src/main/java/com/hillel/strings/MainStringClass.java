package com.hillel.strings;

public class MainStringClass {
    public static void main(String[] args) {
        String str = "HelloJ Java!";
        int f = str.indexOf('J');
        int f1 = str.indexOf("J");
        int f2= str.lastIndexOf('J');
        System.out.println(f);
        System.out.println(f1);
        System.out.println(f2);
    }
}
