package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.HomepagePO;
import com.testing.pageObject.LoginpagePO;
import com.testing.pageObject.SignuppagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.testing.cucumber.Hooks.driver;

public class AccountManagementSteps {

    WebDriver driver = Hooks.driver;


    @Given("I am on Demoblaze login page")
    public void iAmOnDemoblazeLoginPage() {
        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.clickLoginLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Username, String Password) {
        LoginpagePO loginpagePO = new LoginpagePO(driver);
        loginpagePO.enterUsername(Username);
        loginpagePO.enterPassword(Password);
    }

    @And("I click on Login")
    public void iClickOnLogin() {
        LoginpagePO loginpagePO = new LoginpagePO(driver);
        loginpagePO.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
    }

    @Given("I am on Signup page")
    public void iAmOnSignupPage() {
        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.clickSignupLink();
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String Username, String Password) throws InterruptedException {
        SignuppagePO signuppagePO = new SignuppagePO(driver);
        Thread.sleep(5000);
        signuppagePO.enterUsername(Username);
        signuppagePO.enterPassword(Password);
    }

    @And("I click on Signup")
    public void iClickOnSignup() {
        SignuppagePO signuppagePO = new SignuppagePO(driver);
        signuppagePO.clickSignupButton();
    }

    @Then("User should be created successfully")
    public void userShouldBeCreatedSuccessfully() {
    }
}
