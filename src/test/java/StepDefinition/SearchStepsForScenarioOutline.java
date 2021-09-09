package StepDefinition;

import io.cucumber.java.en.*;

public class SearchStepsForScenarioOutline {
    @Given("Navigate to website")
    public void navigate_to_website() {
        System.out.println("Navigate to the website!!!");
    }
    @When("User search for {string} in the {string}")
    public void user_search_for_in_the(String string, String string2) {
        System.out.println("User search for " + string + " in " + string2);
    }
    @Then("User should see the results for {string}")
    public void user_should_see_the_results_for(String string) {
        System.out.println("In the search result " + string + " products are visible");
        System.out.println(" ");
    }
}
