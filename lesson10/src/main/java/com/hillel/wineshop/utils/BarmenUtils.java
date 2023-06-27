package com.hillel.wineshop.utils;

import java.util.Scanner;

public class BarmenUtils {

    private BarmenUtils() {
    }

    public static boolean isBarmenShakeBeer(Scanner scanner) {
        return scanner.nextBoolean();
    }
}
