package testNGActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @Test
    public void titlePage() {
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test
    public void blackButton() {
        Assert.assertNotEquals((driver.findElement(By.xpath("//button[@class='ui black button']"))).getText(), "Red");
    }

    @Test(enabled = false)
    public void blankMethod() {
        System.out.println("Enabled is false");
    }

    @Test
    public void skippedMethod(){
        throw new SkipException("This is a skipped method");
    }

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
