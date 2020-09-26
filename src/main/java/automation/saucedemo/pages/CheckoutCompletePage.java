package automation.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends BasePage {

    @FindBy(id = "checkout_complete_container")
    private WebElement checkoutCompleteContainer;

    @FindBy(className = "bm-burger-button")
    private WebElement sideMenuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutSidebarButton;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToCheckout() {
        waitVisibility(checkoutCompleteContainer);
        sideMenuButton.click();
        waitVisibility(logoutSidebarButton);
        logoutSidebarButton.click();
    }
}
