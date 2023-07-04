import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity5 extends BaseClass{
    @Test
    public void activity5() {
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
    }
}
