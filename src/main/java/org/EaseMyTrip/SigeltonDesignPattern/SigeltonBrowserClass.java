package org.EaseMyTrip.SigeltonDesignPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigeltonBrowserClass {

    private static SigeltonBrowserClass sigeltonBrowserClass;
    private WebDriver driver;

    private SigeltonBrowserClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    // TO create instance of class
    public static SigeltonBrowserClass getInstanceOfSingletonBrowserClass(){
        if(sigeltonBrowserClass==null){
            sigeltonBrowserClass = new SigeltonBrowserClass();
        }
        return sigeltonBrowserClass;
    }

    public WebDriver getDriver()
    {
        return driver;
    }
}
