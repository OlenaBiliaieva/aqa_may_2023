package com.hillel.lesons.lesson4;

public class Comparation {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        boolean bool = a < b;
        boolean bool1 = a > b;
        boolean bool2 = a == b;
        boolean bool3 = a != b;
        System.out.println(bool);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);

        System.out.println("_____________________________-");

        //strogie
        int k = 3;
        int h = 3;

        boolean b0 = k <= h;
        boolean b1 = k < h;

        boolean b2 = k >= h;
        boolean b3 = k > h;

        System.out.println(b2);
        System.out.println(b3);


        char j = 'j';
        char J = 'J';

        System.out.println(j == J);

        int y = 8;
        int x = 10;

        boolean comb = (x > y) && (x > 0) && (y < 0);

        boolean comb1 = (x > y) & (x > 0) & (y < 0);

        boolean inRange = x > 0 && x < 100;

        // true  //true
        boolean or = x < 9 || x > y;

        //true   //true
        boolean ore = x > 9 | x > y;


        System.out.println(or);
    }
}
