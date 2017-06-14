package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 6/9/2017.
 */
public class FlightResultsPage {
    WebDriver driver;
    WebDriverWait wait;

    By continueButton = By.xpath("//button[@data-test-id='test_continue_btn']");

    public FlightResultsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }
    public void clickContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        driver.findElement(continueButton).click();
    }
}
