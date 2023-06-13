package lesson7.scanner;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = ScannerUtils.getInteger(scanner);
        System.out.println(x);
    }

}
