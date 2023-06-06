package com.hillel;

import java.util.Scanner;

public class ArrayOptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("вевдите кол во ячеек");
        int x = scanner.nextInt();
        int[] arr = new int[x];

        int j = 1;
        for (int i = 0; i < arr.length; i += 2, j += 2) {
            arr[i] = j;
        }
        for (int h : arr) {
            System.out.println(h);
        }
    }
}
