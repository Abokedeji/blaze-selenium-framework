package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignuppagePO {

    // Stage 1 - Element locator

    @FindBy(id = "sign-username")
    public static WebElement UsernameField;

    @FindBy(id = "sign-password")
    public static WebElement PasswordField;

    @FindBy(className = "btn btn-primary")
    public static WebElement SignupButton;

    // Stage2 - Initialize webelement to use selenium webdriver

    public SignuppagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Stage 3 - Page specific methods

    public void enterUsername(String Username){
        UsernameField.sendKeys(Username);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void clickSignupButton(){
        SignupButton.click();
    }















}
