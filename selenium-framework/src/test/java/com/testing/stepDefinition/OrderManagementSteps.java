package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.LoginpagePO;
import com.testing.pageObject.ProductpagePO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OrderManagementSteps {

    WebDriver driver = Hooks.driver;

    @Given("I am on user product page")
    public void iAmOnUserProductPage() {
        LoginpagePO loginpagePO = new LoginpagePO(driver);
        loginpagePO.clickLoginButton();
    }

    @When("I click on an item")
    public void iClickOnAnItem() {
        ProductpagePO productpagePO = new ProductpagePO(driver);
        productpagePO.clickSamsungLink();
    }

    @Then("product description page should be displayed")
    public void productDescriptionPageShouldBeDisplayed() {
        String expectedResult = "description";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
