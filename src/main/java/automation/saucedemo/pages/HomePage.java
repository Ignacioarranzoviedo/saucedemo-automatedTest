package automation.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@id='inventory_container']/div/div[1]/div[3]/button")
    private WebElement sauceLabsBackpackAddToCart;

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartContainer;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectSauceLabsBackpack() {
        waitVisibility(sauceLabsBackpackAddToCart);
        sauceLabsBackpackAddToCart.click();
        shoppingCartContainer.click();
    }
}
