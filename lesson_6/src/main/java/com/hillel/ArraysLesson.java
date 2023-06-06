package com.hillel;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //last index = 5 - 1(start from 0)

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 89;
        arr[3] = 67;
        arr[4] = 70;


        //arr.length = 5;
        //4<5 5<5->false {либо меньше  или равно последнему индексу}
        //arr.length-1 =5-1=4;{либо меньше длинны массива(количество ячеек)}

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr);

        int[] arr2 = {3, 4, 6, 8, 10};
        arr2[2] = 8;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[] arr3 = new int[5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
