import PageObject.Homepage;
import PageObject.HotelObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 6/14/2017.
 */
public class HotelTest extends BaseTest {

    @Test

            public void verifyHotels() {
        driver.get("https://www.aerlingus.com/html/en-US/home.html");
        HotelObject hotel = new HotelObject(driver);
        hotel.clickTabHotel();
        String winHandleBefore = driver.getWindowHandle();
        hotel.clickButtonViewHotels();
        for(String winHandle : driver.getWindowHandles()){
            if(!winHandle.equals(winHandleBefore)) {
                driver.switchTo().window(winHandle);
            }
        }
        hotel.clickButtonSearchFlights();
        hotel.assertTextBookFlights();


    }



}
