package testNGActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity9 {
    WebDriver driver;

    @Test
    public void simpleAlertTestCase() {
        Reporter.log("Starting  simpleAlertTestCase()");
        driver.findElement(By.id("simple")).click();
        Reporter.log("simpleAlertTestCase opened");
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched to simple alert");
        String simpleText = simpleAlert.getText();
        Reporter.log("Simple Alert text is: " + simpleAlert);
        Assert.assertEquals(simpleText, "This is a JavaScript Alert!");
        simpleAlert.accept();
    }

    @Test
    public void confirmAlertTestCase() {
        Reporter.log("Starting  confirmAlertTestCase()");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("confirmAlertTestCase opened");
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched to confirm alert");
        String confirmText = confirmAlert.getText();
        Reporter.log("Confirm Alert text is: " + confirmAlert);
        confirmAlert.accept();
        Assert.assertEquals(confirmText, "This is a JavaScript Confirmation!");
    }

    @Test
    public void promptAlertTestCase() {
        Reporter.log("Starting  promptAlertTestCase()");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("promptAlertTestCase opened");
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched to prompt alert");
        String promptText = promptAlert.getText();
        Reporter.log("Prompt Alert text is: " + promptAlert);
        promptAlert.sendKeys("That is wonderful");
        promptAlert.accept();
        Reporter.log("Prompt accepted after input");
        Assert.assertEquals(promptText, "This is a JavaScript Prompt!");
    }


    @BeforeTest
    public void setUp() {
        //Install GeckoDriver
        WebDriverManager.firefoxdriver().setup();
        Reporter.log("Setup driver");
        //Initialize driver
        driver = new FirefoxDriver();
        Reporter.log("Initializing driver");
        //Open a page
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opening website");

    }

    @AfterTest
    public void tearDown() {
        driver.close();
        Reporter.log("Closing browser");
    }
}