package StepDefinition;

import POM.GoogleHomePage;
import POM.GoogleResultsPage;
import Utilities.DriverClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchWithPOM {

    GoogleHomePage googleHomePage = new GoogleHomePage();
    GoogleResultsPage googleResultsPage = new GoogleResultsPage();

    @Given("Navigate to Google w POM")
    public void navigate_to_google_w_pom() {
        WebDriver driver = DriverClass.getDriver();
        driver.get("https://www.google.com/");

        WebElement english = driver.findElement(By.linkText("English"));
        english.click();
    }

    @When("User search for Cucumber in Google w POM")
    public void user_search_for_cucumber_in_google_w_pom() {
        googleHomePage.findElementAndSendKeys("searchInput", "Cucumber");
        googleHomePage.FindElementAndClick("searchButton");
    }

    @Then("User should see Cucumber in Google w POM")
    public void user_should_see_cucumber_in_google_w_pom() {
        googleResultsPage.verifyTextInTheResult("firstSearchResult", "cucumber");
    }
}
