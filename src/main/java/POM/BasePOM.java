package POM;

import Utilities.DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Locale;

public class BasePOM {
    WebDriver driver;
    WebDriverWait wait;

    public  BasePOM(){
        driver = DriverClass.getDriver();
        wait = new WebDriverWait(driver,10);
    }

    public void clickFunction(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void sendKeysFunction(WebElement element,String toSendKeys){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(toSendKeys);
    }

    public void verifyText(WebElement element,String expectedText){
        Assert.assertTrue(element.getText().toLowerCase().contains(expectedText));
    }
}
