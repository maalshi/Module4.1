package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Maryia_Shynkarenka on 6/13/2017.
 */
public class PassengerEssentialsPage {
    WebDriver driver;
    WebDriverWait wait;

    By OutboundFlight = By.xpath("//div[@id='test-left']//div[@class='relative ng-scope'][1]//div[contains(@class,'head-section')]//span[@class='ng-binding']");
    By InboundFlight = By.xpath("//div[@id='test-left']//div[@class='relative ng-scope'][2]//div[contains(@class,'head-section')]//span[@class='ng-binding']");



    public PassengerEssentialsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void assertOutboundFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(OutboundFlight));
        Assert.assertEquals("DUBLIN to PARIS/CDG", driver.findElement(OutboundFlight).getText());
    }

    public void assertInboundFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(InboundFlight));
        Assert.assertEquals("PARIS/CDG to DUBLIN", driver.findElement(InboundFlight).getText());
    }
}
