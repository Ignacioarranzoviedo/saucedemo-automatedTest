package automation.saucedemo.stepDefinintions;

import automation.saucedemo.config.Configuration;
//import automation.saucedemo.config.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Hook.driver = driver;
    }

    @Before
    public void beforeScenario() throws Exception {

        Configuration config = Configuration.getConfiguration();

        String browser = config.getBrowserType();

        WebDriver driver = null;

        if (config.getIsGridRun()) {

            //driver = BrowserFactory.getRemoteWebDriver();

        } else {

            if (browser.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            } else if (browser.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            } else if (browser.equals("internetexplorer")) {
                //driver = BrowserFactory.getInternetExploerDriver();

            } else {
                throw new Exception();
            }
            //maximise window
            driver.manage().window().maximize();
        }
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
