import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity8 extends BaseClass{
    @Test
    public void activity8() {
        driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
        driver.findElement(By.xpath("//form/div/div/label[contains(text(),'Full Name')]/following-sibling::input")).sendKeys("Anjali Lathiya");
        driver.findElement(By.xpath("//form/div/div/label[contains(text(),'Email')]/following-sibling::input")).sendKeys("a@a.com");
        driver.findElement(By.xpath("//form/div/div/label[contains(text(),'Subject')]/following-sibling::input")).sendKeys("Subject");
        driver.findElement(By.xpath("//form/div/div/label[contains(text(),'Comment or Message ')]/following-sibling::textarea")).sendKeys("Comment or Message");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText());
    }
}
