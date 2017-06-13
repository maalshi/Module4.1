import PageObject.FlightResultsPage;
import PageObject.Homepage;
import PageObject.PassengerEssentialsPage;
import PageObject.PaxInfoPage;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/6/2017.
 */
public class AssertOriginAndDestination extends BaseTest {

    @Test
    public void verifyAerl() throws InterruptedException {
        driver.get("https://www-devb1.aerlingus.com/html/en-US/home.html");
        Homepage homepage = new Homepage(driver);
        homepage.clickOrigin();
        homepage.sendKeysOrigin();
        homepage.clickOriginSuggestion();
        homepage.clickDestination();
        homepage.sendKeysDestination();
        homepage.clickDestinationSuggestion();
        homepage.clickFindFlightButton();




        FlightResultsPage flightresults = new FlightResultsPage(driver);
        flightresults.clickContinue();


        PaxInfoPage pax = new PaxInfoPage(driver);
        pax.clickTitle();
        pax.clickTitleMr();
        pax.sendKeysFirstName();
        pax.sendKeysFamilyName();
        pax.sendKeysEmail();
        pax.sendKeysConfirmEmail();
        pax.sendKeysAreaCode();
        pax.sendKeysLocalNumber();

        PassengerEssentialsPage essentials = new PassengerEssentialsPage(driver);


    }



}