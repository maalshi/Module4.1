import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Maryia_Shynkarenka on 6/6/2017.
 */
public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void initDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maryia_Shynkarenka\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }

}
