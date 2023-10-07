package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePO {

    // Stage 1 - Element locator

    @FindBy(id = "loginusername")
    public static WebElement UsernameField;

    @FindBy(id = "loginpassword")
    public static WebElement PasswordField;

    @FindBy(className = "btn btn-primary")
    public static WebElement LoginButton;

    // Stage 2 - Initialize webelement to use selenium webdriver

    public LoginpagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Stage 3 - Page specific methods

    public void enterUsername(String Username){
        UsernameField.sendKeys(Username);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void clickLoginButton(){
        LoginButton.click();
    }






}
