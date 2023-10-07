package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductpagePO {

    // Stage 1 - Element locator

    @FindBy(className = "hrefch")
    public static WebElement SamsungLink;

    // Stage 2 - Initialize webelement to use selenium webdriver

    public ProductpagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // Stage 3 - Page specific methods

    public void clickSamsungLink(){
        SamsungLink.click();
    }












}
