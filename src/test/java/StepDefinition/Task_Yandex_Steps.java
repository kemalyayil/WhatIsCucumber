package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Task_Yandex_Steps {

    WebDriver driver;
    @Given("Navigate to Yandex")
    public void navigate_to_yandex() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://yandex.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User search for {string} in Yandex")
    public void user_search_for_in_yandex(String string) {
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='text']"));
        searchInput.sendKeys(string);

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
    }
    @Then("User should see the results about {string} in Yandex")
    public void user_should_see_the_results_about_in_yandex(String string) {
        WebElement searchResult = driver.findElement(By.xpath("//div[@class='OrganicTitle-LinkText organic__url-text']"));
        Assert.assertTrue(searchResult.getText().toLowerCase().contains(string));
    }



}
