package com.hillel.calc;

import java.util.Objects;

public class Calculator {

    int result;

    public int summ(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
}
