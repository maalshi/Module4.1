package PageObject.HotelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Maryia_Shynkarenka on 6/14/2017.
 */
public class HotelObject {

    WebDriver driver;
    WebDriverWait wait;

    By tabHotel = By.xpath("//*[contains(@id,'partner-tab') and contains(.,'HOTELS')]");
    By buttonViewHotels = By.id("hotel-link-1");



    public HotelObject(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }


    public void clickTabHotel(){
        wait.until(ExpectedConditions.elementToBeClickable(tabHotel));
        driver.findElement(tabHotel).click();

    }

    public void clickButtonViewHotels(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonViewHotels));
        driver.findElement(buttonViewHotels).click();

    }




}
