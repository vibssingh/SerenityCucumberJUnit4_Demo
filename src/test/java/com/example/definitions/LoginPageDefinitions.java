package com.example.definitions;

import com.example.steps.StepDashboardPage;
import com.example.steps.StepLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginPageDefinitions {

    @Steps
    StepLoginPage loginPage;

    @Steps
    StepDashboardPage dashPage;

    @Given("User is on Home page")
    public void openApplication() {
        loginPage.open();
        System.out.println("Page is opened");
    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void enterPassword(String passWord) {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
    }

    @Then("User should be able to login successfully")
    public void clickOnLoginButton() {
        dashPage.loginVerify();
    }

    @Then("User should be able to see error message {string}")
    public void unsucessfulLogin(String expectedErrorMessage) throws InterruptedException {

        String actualErrorMessage = loginPage.errorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

}