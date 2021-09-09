package POM;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPage extends BasePOM{
    public  GoogleResultsPage(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "//h3")
    private WebElement firstSearchResult;


    WebElement myElement;
    public void verifyTextInTheResult(String elementName, String expectedText){

        switch (elementName){
            case "firstSearchResult":
                myElement = firstSearchResult;
                break;
        }

    }

}
