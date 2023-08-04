package com.hillel.calc;

import org.testng.annotations.DataProvider;
public class DataProviderFactory {

    @DataProvider(name = "intProvoder")
    public Object[][] createData() {
        return new Object[][]{
                new Object[]{10, 11, 21},
                new Object[]{3, 11, 14}
        };
    }
}
