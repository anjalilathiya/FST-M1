import org.testng.annotations.Test;

public class Activity1 extends BaseClass {

    //Activity 1
    @Test
    public void activity1() {
        String title = driver.getTitle();
        if (title.equals("Alchemy LMS – An LMS Application")) {
        }
    }
}