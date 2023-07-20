package Classes.Stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {


//    public static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    protected ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    @Before
    public void setUp() {
        if (driverThreadLocal.get() == null) {
            WebDriverManager.chromedriver().setup();
            driverThreadLocal.set(new ChromeDriver());
            WebDriver driver = driverThreadLocal.get();
            System.out.println("Thread ID: " + Thread.currentThread().getId() + " - WebDriver initialized.");
            driver.manage().window().maximize();
        }
    }

    public WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    @After
    public void tearDown() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }


}
