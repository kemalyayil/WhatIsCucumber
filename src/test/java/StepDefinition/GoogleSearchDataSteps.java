package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSearchDataSteps {
    WebDriver driver;
    @Given("Navigate to Google website")
    public void navigate_to_google_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        WebElement english = driver.findElement(By.linkText("English"));
        english.click();
    }
    @When("User should search for {string} in Google")
    public void user_should_search_for_in_google(String string) {
        WebElement searchInput = driver.findElement(By.xpath("//input[@title='Search']"));
        searchInput.sendKeys(string);

        WebElement bosaTikla = driver.findElement(By.xpath("//div[@jsmodel='vWNDde']"));
        bosaTikla.click();

        WebElement searchButton = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
        searchButton.click(); // locator da hata var

    }
    @Then("User should see {string} results in Google")
    public void user_should_see_results_in_google(String string) {
        WebElement searchResult = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(searchResult.getText().toLowerCase().contains(string));
    }

}
