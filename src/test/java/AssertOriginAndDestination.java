import PageObject.AerlPages.FlightResultsPage;
import PageObject.Homepage;
import PageObject.AerlPages.PassengerEssentialsPage;
import PageObject.AerlPages.PaxInfoPage;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/6/2017.
 */
public class AssertOriginAndDestination extends BaseTest {

    @Test
       public void search(){
        driver.get("https://www.aerlingus.com/html/en-US/home.html");
        Homepage homepage = new Homepage(driver);
        homepage.clickOrigin();
        homepage.sendKeysOrigin("dublin");
        homepage.clickOriginSuggestion();
        homepage.clickDestination();
        homepage.sendKeysDestination("paris");
        homepage.clickDestinationSuggestion();
        homepage.clickFindFlightButton();


        FlightResultsPage flightresults = new FlightResultsPage(driver);
        flightresults.clickContinue();
    }

    @Test(dependsOnMethods = { "search" }, alwaysRun = true)
    public void passengerInfo() {
        PaxInfoPage pax = new PaxInfoPage(driver);
        //  pax.clickTitle();
        pax.clickTitleMr();
        pax.sendKeysFirstName("John");
        pax.sendKeysFamilyName("Blare");
        pax.sendKeysEmail("maalshi@mail.ru");
        pax.sendKeysConfirmEmail("maalshi@mail.ru");
        pax.sendKeysAreaCode("34");
        pax.sendKeysLocalNumber("3434");
        pax.clickContinue();

    }
    @Test (dependsOnMethods = { "search", "passengerInfo" }, alwaysRun = true)
            public void assertEssentials(){
        PassengerEssentialsPage essentials = new PassengerEssentialsPage(driver);
        essentials.assertOutboundFlight();
        essentials.assertInboundFlight();


    }



}