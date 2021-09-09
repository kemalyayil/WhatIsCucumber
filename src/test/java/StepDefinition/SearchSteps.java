package StepDefinition;

import io.cucumber.java.en.*;

public class SearchSteps {
    @Given("Go to products page")
    public void go_to_products_page() {
        System.out.println("Go to products page");
    }
    @When("User search for MacBook")
    public void user_search_for_mac_book() {
        System.out.println("User search for MacBook");
    }
    @Then("All the results should be displayed for MacBook")
    public void all_the_results_should_be_displayed_for_mac_book() {
        System.out.println("All the results are MacBook");
    }
    @When("User search for Samsung")
    public void user_search_for_samsung() {
        System.out.println("User search for Samsung");
    }
    @Then("All the results should be displayed for Samsung")
    public void all_the_results_should_be_displayed_for_samsung() {
    System.out.println("All the results are Samsung");
    }
}
