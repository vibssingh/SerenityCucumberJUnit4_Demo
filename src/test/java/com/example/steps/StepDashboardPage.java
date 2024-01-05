package com.example.steps;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class StepDashboardPage extends PageObject {

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    WebElementFacade dashboardText;

    public void loginVerify() {

        String dashboardTitle = dashboardText.getText();
        Assert.assertTrue(dashboardTitle.contains("Dashboard"));
    }
}
