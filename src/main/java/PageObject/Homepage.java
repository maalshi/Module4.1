package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.bind.Element;
import java.util.List;
import java.util.Set;

/**
 * Created by Maryia_Shynkarenka on 6/7/2017.
 */
public class Homepage {

    WebDriver driver;
    public Homepage(WebDriver driver) {
        //PageFactory.initElements(driver, this.getClass());
        this.driver = driver;
    }

    //@FindBy(xpath = "//*[@id='origin']/div")
    //private WebElement origin;

   // WebElement Origin = webdriver.findElement(By.xpath("//*[@id='origin']/div"));


    //WebElement Destination = webdriver.findElement(By.xpath(".//*[@id='dest']"));

    //WebElement DepartureDate = webdriver.findElement(By.xpath(".//*[@id='homepage_cal_dept']/div"));

    //WebElement ArrivalDate = webdriver.findElement(By.xpath(".//*[@id='homepage_cal_return']/div[2]"));
  // "//input[text()='origin']/div"
    //       "//input[contains(text(),'origin')]/div"
    public void clickOrigin(){
        driver.findElement(By.xpath("//input[@id='origin']/div")).click();
    }

    public void clearOrigin(){
        driver.findElement(By.xpath("//input[@id='origin']/div")).clear();
    }

    public void sendKeysOrigin(){
        driver.findElement(By.xpath("//input[@id='origin']/div")).sendKeys("dublin");
    }

    public void clickOriginSuggestion(){
        driver.findElement(By.xpath(".//*[@id='typeahead-0HJ-6123-option-0']/a")).click();
    }

    public void clickDestination(){
        driver.findElement(By.xpath(".//*[@id='dest']")).click();
    }

    public void sendKeysDestination(){
        driver.findElement(By.xpath("//input[@id='origin']/div")).sendKeys("paris");
    }

    public void clickDestinationSuggestion(){
        driver.findElement(By.xpath(".//*[@id='typeahead-0HM-1558-option-0']/a")).click();
    }


}
