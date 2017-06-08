import PageObject.Homepage;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/6/2017.
 */
public class AerlingusTest extends BaseTest {

    @Test
    public void verifyAerl() throws InterruptedException {
        driver.get("https://www.aerlingus.com/html/en-US/home.html");
        Thread.sleep(5000);
        Homepage homepage = new Homepage(driver);
        homepage.clickOrigin();
        Thread.sleep(5000);
        homepage.sendKeysOrigin();
        homepage.clickOriginSuggestion();
        homepage.clickDestination();
        homepage.sendKeysDestination();
        homepage.clickDestinationSuggestion();
    }



}
