package com.hillel.lesson5.loops;

import java.util.Scanner;
import java.util.SortedMap;

public class Loops {

    public static void main(String[] args) {
        // вывести 100 раз слово "Хелло"
        for (int i = 0; i <= 100; i++) {
            System.out.println("Хелло");
        }

        // вывести послед нечетніх чисел от 10 50
        int j = 19;
        int k = 0;
        for (int i = 11; i <= 50; i = i + 2) {
            System.out.println("Нечетное " + i + " " + j + " " + k);
            j++;
            k = k + 8;
            i = i + 2;
        }

        // вывести 100 раз слово "Хелло l"
        for (int l = 0; l <= 100; l++) {
            System.out.println("Хелло " + l);
        }

        int u = 0;
        while (u <= 100){
            System.out.println("Хелло " + u);
            u++;
        }

        // вывести целое число пока юзер ввобдит целое число
        Scanner scaner = new Scanner(System.in);

        while (scaner.hasNextInt()) {
            System.out.println("Scanner " + scaner.nextInt());
        }


    }

}
