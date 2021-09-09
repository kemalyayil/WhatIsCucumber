package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class Task_Selenium_Cucumber_Steps {
   WebDriver driver;

    @Given("Navigate to Selenium Easy")
    public void navigate_to_selenium_easy() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        driver.manage().window().maximize();
    }
    @When("User enter a valid information regarding {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void user_enter_a_valid_information_regarding(String firstNameInput, String lastNameInput, String emailInput, String phoneInput, String addressInput, String cityInput, String stateInput, String zipInput, String websiteInput, String hostingInput, String descriptionInput) {
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys(firstNameInput);

        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys(lastNameInput);

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(emailInput);

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(phoneInput);

        WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys(addressInput);

        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys(cityInput);

        Select select = new Select(driver.findElement(By.xpath("//select[@name='state']")));
        select.selectByVisibleText(stateInput);

        WebElement zip = driver.findElement(By.xpath("//input[@name='zip']"));
        zip.sendKeys(zipInput);

        WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
        website.sendKeys(websiteInput);

        if (hostingInput.toLowerCase().contains("yes")){
            WebElement clickYes = driver.findElement(By.xpath("//input[@value='yes']"));
            clickYes.click();
        }else if (hostingInput.toLowerCase().contains("no")){
            WebElement clickNo = driver.findElement(By.xpath("//input[@value='no']"));
            clickNo.click();
        }

        WebElement description = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        description.sendKeys(descriptionInput);

        driver.quit();
    }
    @Then("User can click {string} and receive the success message")
    public void user_can_click_and_receive_the_success_message(String string) {
        System.out.println(string);
    }

}
