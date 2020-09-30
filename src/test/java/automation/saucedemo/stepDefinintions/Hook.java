package automation.saucedemo.stepDefinintions;

import automation.saucedemo.config.Configuration;
import automation.saucedemo.config.RemoteBrowserSet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Hook.driver = driver;
    }

    @Before
    public static void setupClass() throws Exception {
        Configuration config = Configuration.getConfiguration();
        String browser = config.getBrowserType();
        driver = null;

        if (config.getIsGridRun()) {
            driver = RemoteBrowserSet.getRemoteWebDriver();
        } else {
            if (browser.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();

            } else if (browser.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();

            } else if (browser.equals("internetexplorer")) {
                //TODO internetexplorer is not implemented yet
//                WebDriverManager.iedriver().setup();
//                driver = new InternetExplorerDriver();
//                driver.manage().window().maximize();

            } else {
                throw new Exception();
            }
        }
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
