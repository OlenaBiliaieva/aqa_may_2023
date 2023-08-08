package com.hillel.assertions;

import com.hillel.calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculationAssert {
    private Calculator calculator = new Calculator();

    @Test
    public void testSumm() {
        Calculator calculator1 = new Calculator();
        Assert.assertEquals(calculator, calculator1);
        Assert.assertSame(calculator, calculator1);

    }

    @Test
    public void test() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1, 2,"not equals, test was failed");
        Assert.assertEquals(1, 2);
        Assert.assertEquals(1, 1);
    }

    @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "/ by zero")
    public void test2() {
        calculator.div(9,0);
    }
}
