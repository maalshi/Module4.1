package PageObject.HotelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 6/14/2017.
 */
public class HotelPage {

    WebDriver driver;
    WebDriverWait wait;

    By buttonSearchFlights = By.id("green-search-dates-flights_IE-EUR");

    public HotelPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void clickButtonSearchFlights(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonSearchFlights));
        driver.findElement(buttonSearchFlights).click();

    }
}
