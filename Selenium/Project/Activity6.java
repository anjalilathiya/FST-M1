import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 extends BaseClass{
    @Test
    public void activity6() {
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//p[@class='login-username']/input")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        Assert.assertTrue(true, String.valueOf(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed()));
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
}
