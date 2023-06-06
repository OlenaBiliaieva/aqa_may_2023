package com.hillel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("вевдите кол во ячеек");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }

        // arr, index, counter,
        //начинается с индекс заканчивается коунтером
        // arr 2



        for (int l : arr) {
            System.out.printf(l + " ");
        }

        //format string
        System.out.printf("Hello %s %s", "world","!");
    }
}
