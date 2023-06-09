package lesson7.scanner;

import java.util.Scanner;

public class ScannerUtils {

    public static int getInteger(Scanner scanner) {
        return scanner.nextInt();
    }

    public static long getLong(Scanner scanner) {
        return scanner.nextLong();
    }

    public static int getChar(char c, int x, int y) {
        switch (c) {
            case '+':
                return x + y;
            default:
                return 0;
        }
    }
}
