//package automation.saucedemo.config;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import java.net.URL;
//
///**
// * Created by matthewtully on 09/11/2015.
// */
//public class BrowserFactory {
//
//    private static WebDriver driver = null;
//
//
//    public static WebDriver getRemoteWebDriver() throws Exception {
//
//        driver = new RemoteWebDriver(
//                new URL("http://localhost:4444/wd/hub"),
//                DesiredCapabilities.firefox());
//
//        return driver;
//
//    }
//
//    public static void tearDown() {
//        if (driver != null) {
//            try {
//                driver.manage().deleteAllCookies();
//            } catch (Exception e) {
//                //TODO logging
//                System.out.println("Exception: Unable to delete all coookies!");
//
//            }
//            try {
//                driver.quit();
//            } catch (Exception e) {
//                //TODO logging
//                System.out.println("Exception: Unable execute driver.quit");
//            }
//        }
//    }
//
//
//}
