package com.hillel.calculator;

import com.hillel.calcilator.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Calculator was created");
        calculator = new Calculator();
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Before each ");
    }

    @Test
    @Order(1)
    @DisplayName("Test summ a+b")
    public void testSumm() {
        int a = 10;
        int b = 3;
        int result = 13;
        int actualResult = calculator.summ(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }

    @Test
    @Order(0)
    @DisplayName("Test summ a+b not equals")
    public void testSumm2() {
        int a = 10;
        int b = 4;
        int result = 13;
        int actualResult = calculator.summ(a, b);
        Assertions.assertNotEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }


    @AfterEach
    public void after() {
        System.out.println("After each");
    }

    @AfterAll
    public static void close() {
        System.out.println("All Tests was finished");
    }

    @Test
    public void getException() {
        int a = 10;
        int b = 0;
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> calculator.division(a, b));
        Assertions.assertEquals("/ by zero", exception.getMessage());
    }
}
