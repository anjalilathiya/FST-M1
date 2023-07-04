import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 extends BaseClass{
    @Test
    public void activity7() {
        int c = 0;
        driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
        List<WebElement> list = driver.findElements(By.className("col-sm-8"));
        for (WebElement count : list) {
            c = list.size();
        }
        System.out.println("Number of courses : " + c);
    }
}
