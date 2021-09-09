package StepDefinition;

import io.cucumber.java.en.*;

public class LoginSteps {
    @Given("Navigate to  website")
    public void navigate_to_website() {
        System.out.println("Navigate to website");
    }
    @When("User enter valid username and password")
    public void user_enter_valid_username_and_password() {
        System.out.println("User entered valid username and password");
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Login successful!!!");
    }
    @When("User enter invalid username and password")
    public void user_enter_invalid_username_and_password() {
        System.out.println("User enter invalid username and password");
    }
    @Then("Login should fail")
    public void login_should_fail() {
        System.out.println("Login failed!!!!");
    }

    @When("User enter valid username and an invalid password")
    public void userEnterValidUsernameAndAnInvalidPassword() {
        System.out.println("User enter valid username and an invalid password");
    }



}
