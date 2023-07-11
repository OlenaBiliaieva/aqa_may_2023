package calc.impl;

import calc.abst.Calculation;

public class Calculator implements Calculation {

    @Override
    public int summ(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
