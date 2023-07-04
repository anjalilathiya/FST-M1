import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity2 extends BaseClass {
    @Test
    public void activity2() {
        WebElement heading = driver.findElement(By.xpath("//h1[text()=' Learn from Industry Experts ']"));
        if (heading.getText().equals("Learn from Industry Experts")) {
        }
    }
}
