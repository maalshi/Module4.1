import PageObject.FlightResultsPage;
import PageObject.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AerLingusTest1 {

    protected WebDriver driver;

    @BeforeMethod
    public void initDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maryia_Shynkarenka\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyAerl1(){

        driver.get("https://www-devb1.aerlingus.com/html/en-US/home.html");
        driver.findElement(By.xpath("//*[@id='origin']/div")).click();
        driver.findElement(By.xpath("//*[@id='origin']/div")).sendKeys("dublin");
        driver.findElement(By.xpath("//li[contains(@id,'typeahead')]")).click();

        driver.findElement(By.xpath("//*[@id='dest']/div")).click();
        driver.findElement(By.xpath("//*[@id='dest']/div")).sendKeys("paris");
        driver.findElement(By.xpath("//li[contains(@id,'typeahead')]")).click();

        driver.findElement (By.xpath("//button[@data-test-id='test_booker_search']")).click();


        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-test-id='test_continue_btn']")));
        driver.findElement(By.xpath("//button[@data-test-id='test_continue_btn']")).click();
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }




}
