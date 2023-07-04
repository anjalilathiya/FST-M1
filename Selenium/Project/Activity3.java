import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 extends BaseClass {
    @Test
    public void activity3() {
        String firstInfoBox = driver.findElement(By.xpath("//h3[text()=' Actionable Training ']")).getText();
        Assert.assertEquals(firstInfoBox, "Actionable Training");
    }
}
