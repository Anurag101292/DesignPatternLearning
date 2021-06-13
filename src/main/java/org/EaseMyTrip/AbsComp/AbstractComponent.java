package org.EaseMyTrip.AbsComp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractComponent {
    WebElement sectionElement;
    WebDriver driver;
    public AbstractComponent(WebDriver driver, By sectionElement) {
        this.driver = driver;
        this.sectionElement =driver.findElement(sectionElement);
    }

    public WebElement findElement(By fieldElement){
        return sectionElement.findElement(fieldElement);

    }


}
