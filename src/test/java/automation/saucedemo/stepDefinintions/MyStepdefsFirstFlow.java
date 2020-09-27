package automation.saucedemo.stepDefinintions;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

import automation.saucedemo.pages.CheckoutCompletePage;
import automation.saucedemo.pages.CheckoutOverviewPage;
import automation.saucedemo.pages.HomePage;
import automation.saucedemo.pages.LoginPage;
import automation.saucedemo.pages.ProceedCheckoutPage;
import automation.saucedemo.pages.YourCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PageGenerator;

public class MyStepdefsFirstFlow {

    protected WebDriver driver = Hook.getDriver();

    @Given("^the user is in the Saucedemo login screen$")
    public void theUserIsInTheSaucedemoLoginScreen() throws Throwable {
        PageGenerator.getInstance(LoginPage.class, driver).goToThePage();
    }

    @When("^the user logs in with the \"([^\"]*)\" and the \"([^\"]*)\"$")
    public void theUserLogsInWithTheAndThe(String usernames, String password) throws Throwable {
        PageGenerator.getInstance(LoginPage.class , driver).login(usernames,password);
    }

    @And("^the user adds to cart the sauceLabs Backpack$")
    public void theUserSelectsAProduct() throws Throwable{
        PageGenerator.getInstance(HomePage.class, driver).selectSauceLabsBackpack();
    }

    @And("^the user proceeds to checkout$")
    public void theUserProceedsToCheckout() throws Throwable {
        PageGenerator.getInstance(YourCartPage.class, driver).validateInventory();
        PageGenerator.getInstance(YourCartPage.class, driver).goToCheckout();
        PageGenerator.getInstance(ProceedCheckoutPage.class, driver).checkout();
    }

    @And("^the user confirms the checkout$")
    public void theUserConfirmsTheCheckout() throws Throwable {
        PageGenerator.getInstance(CheckoutOverviewPage.class, driver).finishCheckout();
    }

    @And("^the user is logging out$")
    public void theUserIsLoggingOut() throws Throwable {
        PageGenerator.getInstance(CheckoutCompletePage.class, driver).logout();
    }

    @Then("^the user returns to the Saucedemo login screen$")
    public void theUserReturnsToTheSaucedemoLoginScreen() throws Throwable {
        PageGenerator.getInstance(LoginPage.class, driver).validateLoginPage();
    }
}
