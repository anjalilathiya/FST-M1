package testNGActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {
    WebDriver driver;

    @Test(groups = {"HeaderTests"})
    public void headerTest1() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.findElement(By.cssSelector("h3#third-header")).getText(), "Third header");
    }

    @Test(groups = {"HeaderTests"})
    public void headerTest2(){
       //Find and assert the colour of the fifth header tag element.
        WebElement header5 = driver.findElement(By.cssSelector("h5.green"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }

    @Test(groups = {"ButtonTests"})
    public void buttonTest1(){
        String button1 = driver.findElement(By.cssSelector("button.olive")).getText();
        Assert.assertEquals(button1, "Olive");
    }

    @Test(groups = {"ButtonTests"})
    public void buttonTest2(){
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)" );
    }

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        //Install GeckoDriver
        WebDriverManager.firefoxdriver().setup();
        //Initialize driver
        driver = new FirefoxDriver();
        //Open a page
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
