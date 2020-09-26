package automation.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import automation.saucedemo.data.CheckoutData;

public class ProceedCheckoutPage extends BasePage{

    private static final String FIRST_NAME = CheckoutData.FIRST_NAME.getData();
    private static final String LAST_NAME = CheckoutData.LAST_NAME.getData();
    private static final String ZIP_CODE = CheckoutData.ZIP_CODE.getData();

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement zipOrPostalCodeInput;

    @FindBy(className = "btn_primary.cart_button")
    private WebElement continueButton;

    public ProceedCheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void checkout() {
        waitVisibility(firstNameInput);
        writeText(firstNameInput, FIRST_NAME);
        writeText(lastNameInput, LAST_NAME);
        writeText(zipOrPostalCodeInput, ZIP_CODE);
        continueButton.click();
    }
}
