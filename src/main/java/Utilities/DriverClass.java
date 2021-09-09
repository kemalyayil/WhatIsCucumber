package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        //if driver is equal to null then initialize it to vhrome driver
        // if it is not equal to null then return the current driver
        if (driver== null){             // bunu yapmamizin nedeni line 9 da initilaze yapilmamis olan elementi desteklemek
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;   // bu sekilde yazmazsak, hala chromeDriver olacagi icin, null diye ayarlamamiz gerekiyor
        }
    }
}
