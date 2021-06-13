package org.EaseMyTrip.AbsComp;

import org.EaseMyTrip.DataObjects.OneWay;
import org.EaseMyTrip.DataObjects.RoundTrip;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StrategyFactor {

    WebDriver driver;
    By sectionElement = By.xpath("//div[@class='pageBgBlue']");

    public StrategyFactor(WebDriver driver){
        this.driver=driver;
    }

    public  SearchAvail setStrategy(String type){
        if (type.equalsIgnoreCase("Oneway")){

            return new OneWay(driver,sectionElement);
        }
        if (type.equalsIgnoreCase("RoundTrip")){

            return new RoundTrip(driver,sectionElement);
        }
        return null;


    }
}
