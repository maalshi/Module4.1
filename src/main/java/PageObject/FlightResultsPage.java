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

    By continueButton = By.xpath("//html/body/div[3]/div/div[4]/div[2]/div[2]/div/div[2]/div[6]/div[1]/div/button[2]");

    public void clickContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        driver.findElement(continueButton).click();
    }
}
