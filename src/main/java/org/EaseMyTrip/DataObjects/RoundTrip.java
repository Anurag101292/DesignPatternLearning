package org.EaseMyTrip.DataObjects;

import org.EaseMyTrip.AbsComp.AbstractComponent;
import org.EaseMyTrip.AbsComp.SearchAvail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class RoundTrip extends AbstractComponent implements SearchAvail {
    public RoundTrip(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    @Override
    public void search(HashMap<String, String> data) {

    }
}
