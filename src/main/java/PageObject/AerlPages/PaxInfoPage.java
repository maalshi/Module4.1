package PageObject.AerlPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 6/13/2017.
 */
public class PaxInfoPage {

    WebDriver driver;
    WebDriverWait wait;

    By title = By.id("test_adultTitle-0-1");
    By titleMr = By.xpath("//option[text()='Mr']");
    By firstName = By.id("test_adultFname-0-1");
    By familyName = By.id("test_adultLname-0-2");
    By email = By.xpath("//*[@id='test_email-3']");
    By confirmEmail = By.xpath("//*[@id='test_confirmemail-6']");
    By areaCode = By.xpath("//*[@id='test_acode-4']");
    By localNumber = By.xpath("//*[@id='test_mobnumber-5']");
    By continueButton = By.id("test_continueTravelEsstl");

    public PaxInfoPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

 //   public void clickTitle(){
  //      wait.until(ExpectedConditions.elementToBeClickable(title));
  //      driver.findElement(title).click();
  //  }

    public void clickTitleMr(){
        wait.until(ExpectedConditions.elementToBeClickable(titleMr));
        driver.findElement(titleMr).click();
    }

    public void sendKeysFirstName(String name){
        driver.findElement(firstName).sendKeys(name);
    }

    public void sendKeysFamilyName(String surname){
        driver.findElement(familyName).sendKeys(surname);
    }

    public void sendKeysEmail(String emailAddress){
        driver.findElement(email).sendKeys(emailAddress);
    }

    public void sendKeysConfirmEmail(String confirmEmailAddress){
        driver.findElement(confirmEmail).sendKeys(confirmEmailAddress);
    }

    public void sendKeysAreaCode(String area){
        driver.findElement(areaCode).sendKeys(area);
    }

    public void sendKeysLocalNumber(String local){
        driver.findElement(localNumber).sendKeys(local);
    }

    public void clickContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        driver.findElement(continueButton).click();
    }




}
