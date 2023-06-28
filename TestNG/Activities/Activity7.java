package testNGActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.net.Authenticator;

public class Activity7 {
    WebDriver driver;

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][]{{"admin", "password"}};

    }

    @Test(dataProvider = "Authentication")
    public void credentialTest(String username, String password) {
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }


    @BeforeMethod
    public void setUp() {
        //Install GeckoDriver
        WebDriverManager.firefoxdriver().setup();
        //Initialize driver
        driver = new FirefoxDriver();
        //Open a page
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
