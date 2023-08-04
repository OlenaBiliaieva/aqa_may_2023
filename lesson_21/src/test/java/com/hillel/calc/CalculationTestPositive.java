package com.hillel.calc;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculationTestPositive {
    private Calculator calculator = new Calculator();

    @BeforeSuite
    public void init() {
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @BeforeGroups
    public void init2() {
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @BeforeClass
    public void init1() {
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @Test(groups = {"smoke", "regression"})
    public void summTest() {
        int a = 10;
        int b = 11;
        int result = calculator.summ(a, b);
        Assert.assertEquals(result, 21);
        System.out.println("test1");
    }
}
