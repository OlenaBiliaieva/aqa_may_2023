package com.hillel;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 9};
        int index = 2;
        int counter = 10;
        int[] arrNew = new int[counter];

        int left = arr.length - 2;//7


        //arr.lengt < counter => arrNew =1
        //arr.lenght - index => колл во ячеек

        int j = 0;
        for (int i = index; i < arr.length; i++, j++) {
            arrNew[j] = arr[i];
            System.out.println(arrNew[j] + " = " + arr[i]);
        }

        for (int i = left; i < arrNew.length; i++) {
            arrNew[i] = 1;
        }
        for (int h : arrNew) {
            System.out.println(h);
        }
    }

}
