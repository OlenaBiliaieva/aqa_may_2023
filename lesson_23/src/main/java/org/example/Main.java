package org.example;

public class Main {
    public static void main(String[] args) {
        String example = "fffff fff ab f 1234 jkjk";
        String[] arr = example.split(" ");
        char[] arr1 = "ghtry".toCharArray();
        int minCount = Integer.MAX_VALUE;
        String minWord = "a";
        for (int i = 0; i < arr.length; i++) {
            int maxValue = getCountSameSymbol(sort(arr[i].toCharArray()));
            if (minCount > maxValue) {
                minCount = maxValue;
                minWord = arr[i];

            }
        }
        System.out.println(minWord);

//        printArray(sort(arr1));
    }

    public static char[] sort(char[] arr) {
        char a;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    a = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = a;
                }
            }
        }
        return arr;
    }

    public static int getCountSameSymbol(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        return count;
    }


    public static void printArray(char[] arr) {
        for (char b : arr) {
            System.out.println(b);
        }
    }

}