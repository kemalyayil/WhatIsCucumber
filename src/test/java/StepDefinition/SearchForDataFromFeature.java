package StepDefinition;

import io.cucumber.java.en.*;

public class SearchForDataFromFeature {
    @When("User search for {string}")
    public void userSearchFor(String string) {
        System.out.println("User search for " + string);
    }
    @Then("All the results should be displayed for {string}")
    public void all_the_results_should_be_displayed_for(String string) {
        System.out.println("All the results are related to: " + string);
    }
}
