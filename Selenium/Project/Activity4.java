import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4 extends BaseClass{

    @Test
    public void activity4() {
        String courseTitle = driver.findElement(By.xpath("//article[@id='post-71']/div[2]/h3")).getText();
        System.out.println("Title of the course is: " + courseTitle);
        Assert.assertEquals(courseTitle, "Email Marketing Strategies");
    }
}
