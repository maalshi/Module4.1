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

    By continueButton = By.cssSelector(".v-align-child.l2.button.button-standard.button-shamrockGreen-gradient.padding-left-xlrg.padding-right-xlrg.float-right.padding-top-xs.padding-bottom-xs");

    public FlightResultsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void clickContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        driver.findElement(continueButton).click();
    }
}
