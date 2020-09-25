package com.automation.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends BasePage{

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']//span")
    private WebElement sauceLabsBackpackAddToCart;

    public HomeScreen(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectSauceLabsBackpack() {
        waitVisibility(sauceLabsBackpack);
        sauceLabsBackpack.click();
    }
}
