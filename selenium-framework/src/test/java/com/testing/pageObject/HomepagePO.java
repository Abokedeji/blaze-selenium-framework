package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePO {

    // Element Locator - Stage 1
    @FindBy(id = "login2")
    public static WebElement LoginLink;

    @FindBy(id = "signin2")
    public static WebElement SignupLink;

    // Initialise webelement to use selenium webdriver - Stage 2

    public HomepagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Page specific method - Stage 3

    public void clickLoginLink(){
        LoginLink.click();
    }

    public void clickSignupLink(){
        SignupLink.click();
    }












}
