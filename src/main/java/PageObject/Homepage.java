package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Maryia_Shynkarenka on 6/7/2017.
 */
public class Homepage {

    WebDriver driver;
    WebDriverWait wait;

    By origin = By.xpath("//*[@id='origin']/div");
    By suggestion = By.xpath("//li[contains(@id,'typeahead')]");
    By destination = By.xpath("//*[@id='dest']/div");
    By findFlightButton = By.xpath("//button[@data-test-id='test_booker_search']");



    public Homepage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickOrigin(){
        wait.until(ExpectedConditions.elementToBeClickable(origin));
        driver.findElement(origin).click();
    }

    public void clearOrigin(){
        driver.findElement(origin).clear();
    }

    public void sendKeysOrigin(){
        driver.findElement(origin).sendKeys("dublin");
    }

    public void clickOriginSuggestion(){
        driver.findElement(suggestion).click();
    }

    public void clickDestination(){
        driver.findElement(destination).click();
    }

    public void sendKeysDestination(){
        driver.findElement(destination).sendKeys("paris");
    }

    public void clickDestinationSuggestion(){
        driver.findElement(suggestion).click();
    }

    public void clickFindFlightButton(){
        wait.until(ExpectedConditions.elementToBeClickable(findFlightButton));
        driver.findElement(findFlightButton).click();

    }




}
