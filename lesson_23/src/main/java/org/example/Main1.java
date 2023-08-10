package org.example;

public class Main1 {

    public static void main(String[] args) {
        String k = "iii  Ijjjj  Java";
        String[] str = k.split(" ");
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            int u = countMax(str[i].toCharArray());
            if (u < maxCount) {
                maxCount = u;
                index = i;
            }
        }
        System.out.println(str[index]);
    }

    private static int countMax(char[] array) {
        int maxcount = 0;
        for (int i = 0; i < array.length; ++i) {
            int currentLetterCount = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    currentLetterCount++;
                }
            }
            if (currentLetterCount > maxcount) {
                maxcount = currentLetterCount;
            }
        }
        return  array.length - maxcount;
    }
}
