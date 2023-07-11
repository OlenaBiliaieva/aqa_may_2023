package calc.demo;

import calc.exceptions.InputException;
import calc.impl.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = wrapMethod(scanner);
        Calculator calculator = new Calculator();

        System.out.println(calculator.div(a, b));
        System.out.println(calculator.summ(a, b));
        System.out.println(calculator.mult(a, b));
        System.out.println(calculator.diff(a, b));
    }

    public static int getNumberForDivision(Scanner scanner) throws InputException {
        int x = scanner.nextInt();
        if (x == 0) {
            throw new InputException("You can not enter 0", String.valueOf(x));
        }
        return x;
    }

    public static int wrapMethod(Scanner scanner) {
        System.out.println("Enter not 0 number!");
        try {
            return getNumberForDivision(scanner);
        } catch (InputException e) {
            System.out.println("IOException e");
            System.out.println(e.beautify());
            return wrapMethod(scanner);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException e");
            System.out.println(e.getMessage());
            return wrapMethod(scanner);
        } catch (Exception e) {
            System.out.println("Exception e");
            System.out.println(e.getMessage());
            return wrapMethod(scanner);
        } finally {
            System.out.println("finally");
        }
    }
}
