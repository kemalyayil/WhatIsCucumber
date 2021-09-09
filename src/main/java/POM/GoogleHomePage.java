package POM;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePOM{

    public GoogleHomePage(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }
    @FindBy(xpath = "//input[@title='Search']")
    private WebElement searchInput;

    @FindBy(xpath = " (//input[@value='Google Search'])[2]")
    private WebElement searchButton;

    @FindBy(xpath = " (//input[@value='Google Search'])[2]")
    private WebElement searchButton2;

    @FindBy(xpath = " (//input[@value='Google Search'])[2]")
    private WebElement searchButton3;

    WebElement myElement;
    public void FindElementAndClick(String elementName){
        switch (elementName){

            case "searchButton":
                myElement = searchButton;
                break;

            case "searchButton2":
                myElement = searchButton2;
                break;

            case "searchButton3":
                myElement = searchButton3;
                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeys(String elementName, String toSendKeys){
    switch (elementName){
        case "searchInput":
            myElement = searchInput;
            break;
    }
    sendKeysFunction(myElement,toSendKeys);
    }

}
