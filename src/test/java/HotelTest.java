import PageObject.HotelPages.HotelObject;
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
        HotelObject hotelObject = new HotelObject(driver);
        hotelObject.clickTabHotel();
        String winHandleBefore = driver.getWindowHandle();
        hotelObject.clickButtonViewHotels();
        for(String winHandle : driver.getWindowHandles()){
            if(!winHandle.equals(winHandleBefore)) {
                driver.switchTo().window(winHandle);
            }
        }
        HotelPage hotelPage = new HotelPage(driver);
        hotelPage.clickButtonSearchFlights();

        PlanPage planPage = new PlanPage(driver);
        planPage.assertTextBookFlights();


    }



}
