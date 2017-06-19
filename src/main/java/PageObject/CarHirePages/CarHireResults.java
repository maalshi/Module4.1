package PageObject.CarHirePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Maryia_Shynkarenka on 6/19/2017.
 */
public class CarHireResults {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//label[text()='Pick-up']//p[@class='ct-break-word']")
    WebElement outboundAirport;

    @FindBy(id = "pickupLocation")
    WebElement outboundDate;

    @FindBy(xpath = "//label[text()='Drop-off']//p[@class='ct-break-word']")
    WebElement inboundAirport;

    @FindBy(id = "pickupLocation")
    WebElement inboundDate;


    public CarHireResults(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void assertOutboundAirport(String outbound){
        wait.until(ExpectedConditions.elementToBeClickable(outboundAirport));
        Assert.assertEquals(outbound, driver.findElement((By) outboundAirport).getText());
    }

    public void assertInboundAirport(String inbound){
        wait.until(ExpectedConditions.elementToBeClickable(inboundAirport));
        Assert.assertEquals(inbound, driver.findElement((By) inboundAirport).getText());
    }
}
