package com.example.definitions;

import com.example.steps.StepDashboardPage;
import com.example.steps.StepForgetPasswordPage;
import com.example.steps.StepLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class LoginPageDefinitions {

    @Steps
    StepLoginPage loginPage;

    @Steps
    StepDashboardPage dashPage;

    @Steps
    StepForgetPasswordPage forgetpasswordPage;

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
    public void unsuccessfulLogin(String expectedErrorMessage)  {

        String actualErrorMessage = loginPage.errorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @When("User clicks on Forgot your password link")
    public void clickForgetPasswordLink() {
        loginPage.clickForgetPasswordLink();
    }

    @Then("User should be able to see new page which contains Reset Password button")
    public void verifyForgetPasswordPage() {

        assertTrue(forgetpasswordPage.ForgetPasswordPage());
    }

}