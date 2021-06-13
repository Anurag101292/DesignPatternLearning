package org.EaseMyTrip.PageObjects;

import org.EaseMyTrip.AbsComp.SearchAvail;
import org.EaseMyTrip.AbsComp.StrategyFactor;
import org.EaseMyTrip.DataObjects.EasemytripHeader;

import org.EaseMyTrip.DataObjects.EasemytripSearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class HomePage {
    SearchAvail searchAvail;

    WebDriver driver;
    By sectionElement = By.cssSelector("//div[@class='fltHypContain posRel']");
//    By searchSectionElement = By.xpath("//form[@id='frmHome']/div[14]/div[2]");

    public HomePage(WebDriver driver) {

        this.driver=driver;

    }

    public void goTo(){
        driver.get("https://www.goibibo.com/flights/");

    }

    public EasemytripHeader navigatetoheaderBar()
    {return  new EasemytripHeader(driver, sectionElement);}

  //  public EasemytripSearchBar navigateSearchBar()
  //  {return  new EasemytripSearchBar(driver,sectionElement );}

    public void setBookingStrategy(String strategy){
        StrategyFactor sf = new StrategyFactor(driver);
        searchAvail=sf.setStrategy(strategy);
        this.searchAvail=searchAvail;
    }

    public void checkAvail(HashMap<String,String> reservationDetails){
        searchAvail.search(reservationDetails);
    }



}
