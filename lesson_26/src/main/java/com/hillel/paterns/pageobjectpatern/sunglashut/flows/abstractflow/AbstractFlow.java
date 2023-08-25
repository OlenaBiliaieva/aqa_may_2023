package com.hillel.paterns.pageobjectpatern.sunglashut.flows.abstractflow;

import com.hillel.paterns.pageobjectpatern.sunglashut.flows.commonflows.HeaderFlow;
import org.openqa.selenium.WebDriver;

public class AbstractFlow {
    private HeaderFlow headerFlow;

    public AbstractFlow(WebDriver driver) {
        this.headerFlow = new HeaderFlow(driver);
    }

    public HeaderFlow getHeaderFlow() {
        return headerFlow;
    }
}
