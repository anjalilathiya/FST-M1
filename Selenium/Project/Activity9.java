import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity9 extends BaseClass{
    @Test
    public void activity9() {
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//p[@class='login-username']/input")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]/following-sibling::p[2]/a[@href='https://alchemy.hguy.co/lms/courses/email-marketing-strategies/']")).click();
        driver.findElement(By.xpath("//div[@id='ld-item-list-71']/div[1]/div/a/div[1]")).click();
        Assert.assertEquals(driver.getTitle(), "Deliverability Of Your Emails – Alchemy LMS");
        driver.findElement(By.xpath("//a[contains(text(), 'Back to Course')]/parent::div/div[2]/form/input[4]")).click();
    }

}
