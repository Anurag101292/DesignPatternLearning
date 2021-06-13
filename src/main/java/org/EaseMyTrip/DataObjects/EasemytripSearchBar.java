package org.EaseMyTrip.DataObjects;

import org.EaseMyTrip.AbsComp.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EasemytripSearchBar extends AbstractComponent {

    public EasemytripSearchBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }
}
