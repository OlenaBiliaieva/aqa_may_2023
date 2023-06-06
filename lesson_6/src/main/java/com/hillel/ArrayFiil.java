package com.hillel;

import java.util.Scanner;

public class ArrayFiil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("вевдите кол во ячеек");
        int x = scanner.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("введите число");
            arr[i] = scanner.nextInt();
        }

        for(int p : arr) {
            System.out.println(p);
        }

        System.out.println(arr.length);
    }
}
