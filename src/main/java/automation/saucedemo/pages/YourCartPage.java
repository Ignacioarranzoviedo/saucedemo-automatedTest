package automation.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends BasePage {

    @FindBy(xpath = "//a[@href='/docs/configuration'")
    private WebElement checkoutButton;

    @FindBy(id = "item_4_title_link")
    private WebElement suceLabsBackpackInventory;

    public YourCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToCheckout() {
        waitVisibility(checkoutButton);
        checkoutButton.click();
    }

    public String validateInventory() {
        return exists(suceLabsBackpackInventory);
    }

}
