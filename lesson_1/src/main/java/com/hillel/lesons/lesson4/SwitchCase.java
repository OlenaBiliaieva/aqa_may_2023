package com.hillel.lesons.lesson4;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }

        switch (a) {
            case 0:
                System.out.println("Вы ввели 0");
                break;
            case 3:
                System.out.println("Вы ввели 3");
                break;
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            default:
                System.out.println("Вы ввели что то ");
                break;
        }
        scanner.close();
    }

}
