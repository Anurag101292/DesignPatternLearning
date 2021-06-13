package org.EaseMyTrip.DataLoads;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDataLoads {
    WebDriver driver;

    public WebDriver initializedriver(String webBrowser){
        if (webBrowser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver  = new ChromeDriver();
            driver.manage().window().maximize();

        }
        return driver;
    }


}
