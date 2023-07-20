package Classes.Pageobjects;

import Classes.Stepdefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageObjects {
    public WebDriver driver;

    public PageObjects(Hooks hooks){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        this.driver = hooks.getDriver();
    }
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public void EnterValueInEmail(){
        WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
        Email.sendKeys("Krunal.parekh512@gmail.com");
    }

    public void EntervalueinGoogle(){
        WebElement Googlesearch = driver.findElement(By.xpath("//textarea[@name='q']"));
        Googlesearch.sendKeys("Parallel execution in cucumber framework");
    }

    public void EntervalueinInstagram(){
        WebElement Insta = driver.findElement(By.xpath("//input[@name='username']"));
        Insta.sendKeys("Parekh.k512@gmail.com");
    }

    public void ValidatePageTitle(String title){
        String PageTitle = driver.getTitle();
        Assert.assertEquals(PageTitle,title,"Page title does not matched");
    }


}
