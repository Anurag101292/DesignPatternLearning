package org.EaseMyTrip;

import org.EaseMyTrip.DataLoads.BaseDataLoads;
import org.EaseMyTrip.DataLoads.DataReader;
import org.EaseMyTrip.PageObjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class BaseTest  extends BaseDataLoads {
WebDriver driver;
HomePage hp;
By flight = By.xpath("//a[normalize-space()='Flights']");
By defenceForce= By.xpath("//form[@id='frmHome']//li[4]//label[1][1]//span[1]");

DataReader dataReader ;


@BeforeTest
        public void setup(){
    driver = initializedriver("chrome");
}

 //   @Parameters("reservationDetails")
    @Test(dataProviderClass = DataReader.class,dataProvider = "SearchFlight")
    public void flightTest(HashMap<String,String> reservationDetails) {
        hp = new HomePage(driver);
        hp.goTo();
    //    hp.navigatetoheaderBar().findElement(flight).click();
    //   hp.navigateSearchBar().findElement(defenceForce).click();
    //    driver.findElement(By.xpath("//div[@class='top_bg_ofr']")).findElement(flight).click();
        hp.setBookingStrategy("OneWay");
      hp.checkAvail(reservationDetails);



    }
 //   @AfterTest
 //   public void tearDown()
  //  {
 //       driver.quit();
 //   }



}
