package testNGActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity3 {
    WebDriver driver;

    @Test
    public void example() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String messageDisplayed = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(messageDisplayed,"Welcome Back, admin");
    }

    @BeforeClass
    public void setUp() {
        //Install GeckoDriver
        WebDriverManager.firefoxdriver().setup();
        //Initialize driver
        driver = new FirefoxDriver();
        //Open a page
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
