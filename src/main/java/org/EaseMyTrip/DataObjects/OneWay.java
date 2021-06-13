package org.EaseMyTrip.DataObjects;

import org.EaseMyTrip.AbsComp.AbstractComponent;
import org.EaseMyTrip.AbsComp.SearchAvail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;



public class OneWay extends AbstractComponent implements SearchAvail {

    private By from = By.xpath("//input[@id='gosuggest_inputSrc']");
    private By to = By.xpath("//input[@id='gosuggest_inputDest']");
    private By searchclick= By.xpath("//button[normalize-space()='SEARCH']");
    public OneWay(WebDriver driver, By sectionElement) { super(driver, sectionElement); }

    @Override
    public void search(HashMap<String, String> data) {
          findElement(from).sendKeys(data.get("From"));
          findElement(to).sendKeys(data.get("To"));
          findElement(searchclick).click();

    }
}
