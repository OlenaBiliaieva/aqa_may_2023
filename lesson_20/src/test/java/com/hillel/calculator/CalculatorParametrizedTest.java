package com.hillel.calculator;

import com.hillel.WineColor;
import com.hillel.calcilator.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class CalculatorParametrizedTest {
    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Calculator was created");
        calculator = new Calculator();
    }

    @ParameterizedTest
    @MethodSource("getValues")
    @DisplayName("Test summ a+b")
    public void testSumm(int a, int b, int result) {
        int actualResult = calculator.summ(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }


    public static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(4, 10, 14),
                Arguments.of(5, 5, 10)
        );
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 5",
            "4, 10, 14"
    })
    @DisplayName("Test summ a+b")
    public void testSummCsv(int a, int b, int result) {
        int actualResult = calculator.summ(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", " World ", "!"})
    public void testShow(String string) {
        System.out.print(string);
    }

    @ParameterizedTest
    @EnumSource(names = {"ROSE", "RED"})
    public void testShow(WineColor string) {
        System.out.println(string.name());
    }

    @Test
    public void assertAllShow() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(true),
                () -> Assertions.assertTrue(false)
        );
    }

    @Test
    public void assertAllShow1() {
        Assertions.assertTrue(true);
        Assertions.assertFalse(true);
        Assertions.assertTrue(false);
    }
}
