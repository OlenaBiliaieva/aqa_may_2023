package org.example.lesson4;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        if (a % 2 == 0) {
            System.out.println("Пользователь ввел четное");
        } else {
            System.out.println("Пользователь ввел не четное");
        }


        //взаимо исключающее условие
        if (a == 4) {
            System.out.println("Вы ввели 0");
        } else if (a == 2 || a == 1) {
            System.out.println("Вы ввели 2");
        } else if (a == 3) {
            System.out.println("Вы ввели 3");
        } else {
            System.out.println("Вы ввели не 0");
        }

        if (a > 0) {
            System.out.println("a > 0");
        }
        if (a > 10) {
            System.out.println("a > 10");
        }

        //задача
        if (a > 9 && a < 100) {
            int ed = a % 10;
            int result = ed * (a / 10);
            System.out.println(result);
            if (a > result) {
                System.out.println("a больше");
            } else {
                System.out.println("a меньше");
            }
        }
    }
}
