package testNGActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @Test
    public void example() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Training Support");
        driver.findElement(By.id("about-link")).click();
        String newTitle = driver.getTitle();
        System.out.println(newTitle);
        Assert.assertEquals(newTitle, "About Training Support");
    }

    @BeforeMethod
    public void setUp() {
        //Install GeckoDriver
        WebDriverManager.firefoxdriver().setup();
        //Initialize driver
        driver = new FirefoxDriver();
        //Open a page
        driver.get("https://www.training-support.net/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
