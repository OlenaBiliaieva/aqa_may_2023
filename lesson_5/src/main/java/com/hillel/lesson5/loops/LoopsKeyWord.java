package com.hillel.lesson5.loops;

public class LoopsKeyWord {
    public static void main(String[] args) {
        // нечетные от 1 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Нечетное " + i);
            System.out.println("Нечетное " + i);
        }

        int x = 0;
        while (true) {
            x = x + 3;
            System.out.println(x);
            if (x >=10){
                break;
            }
        }
    }
}
