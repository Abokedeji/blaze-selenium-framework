package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductdescriptionPO {

    // Stage 1 - Element Locator

    @FindBy(className = "btn btn-success btn-lg")
    public static WebElement AddtocartButton;

    // Stage 2 - Initialize webelement to use selenium webdriver

    public ProductdescriptionPO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Stage 3 - Page specific method

    public void clickAddtocartButton(){
        AddtocartButton.click();
    }







}
