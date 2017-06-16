import PageObject.Homepage;
import PageObject.HotelPages.HotelPage;
import PageObject.HotelPages.PlanPage;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/14/2017.
 */
public class HotelTest extends BaseTest {

    @Test

            public void verifyHotels() {
        driver.get("https://www.aerlingus.com/html/en-US/home.html");
        Homepage homepage = new Homepage(driver);
        homepage.clickTabHotel();
        String winHandleBefore = driver.getWindowHandle();
        homepage.clickButtonViewHotels();
        for(String winHandle : driver.getWindowHandles()){
            if(!winHandle.equals(winHandleBefore)) {
                driver.switchTo().window(winHandle);
            }
        }
        HotelPage hotelPage = new HotelPage(driver);
        //assert
        hotelPage.clickButtonSearchFlights();

        PlanPage planPage = new PlanPage(driver);
        planPage.assertTextBookFlights();


    }



}
