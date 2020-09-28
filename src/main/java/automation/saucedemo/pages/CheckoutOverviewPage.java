package automation.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[8]/a[2]")
    private WebElement finishButton;

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void finishCheckout() {
        waitVisibility(finishButton);
        finishButton.click();
    }

}
