package com.hillel.calc;

import listener.Reporter;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Reporter.class)
public class CalcTestDependsOn {

    @Test
    public void test2() {
        System.out.println("test 2");
        System.out.println("depends on test 1");
        Assert.assertEquals(1, 1);
    }


    @Test(dependsOnMethods = {"test2"})
    public void test3() {
        System.out.println("test 3");
        System.out.println("depends on test 2");
        Assert.assertTrue(true);
    }
}
