package org.EaseMyTrip.SigeltonDesignPattern;
import org.openqa.selenium.WebDriver;

public class LoadURL {

        public static void main(String[] args) {

            SigeltonBrowserClass sbc1= SigeltonBrowserClass.getInstanceOfSingletonBrowserClass();
            WebDriver driver1 = sbc1.getDriver();
            driver1.get("https://www.makemytrip.com");


            SigeltonBrowserClass sbc2= SigeltonBrowserClass.getInstanceOfSingletonBrowserClass();
            WebDriver driver2 = sbc2.getDriver();
            driver2.get("https://www.google.com");
        }
    }

