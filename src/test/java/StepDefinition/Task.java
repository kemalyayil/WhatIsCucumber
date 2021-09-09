package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Task {
    @And("Go to class page")
    public void goToClassPage() {
    }

    @When("User search for {string} in the class")
    public void userSearchForInTheClass(String str) {
        System.out.println("All search results regarding : " + str + " in the class");
    }

    @Then("All the results should be displayed for {string} in the class")
    public void allTheResultsShouldBeDisplayedForInTheClass(String str) {
        System.out.println("Final results displayed regarding " + str + " in the class");
    }
}
