package testNGActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;

    @Test
    @Parameters({"username", "password"})
    public void credentials(String username, String password) {
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
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
