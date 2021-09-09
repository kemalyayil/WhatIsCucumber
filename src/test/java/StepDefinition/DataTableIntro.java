package StepDefinition;

import io.cucumber.java.en.*;

import java.util.List;

public class DataTableIntro {
    @Given("Navigate to Hotspot website")
    public void navigate_to_hotspot_website() {
        System.out.println("user navigate to website");
    }
    @When("User enter email address")
    public void user_enter_email_address(io.cucumber.datatable.DataTable dataTable) {  // data table parametresi geldi feature file'dan

        List<String> list = dataTable.asList();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Send Keys -> " + list.get(i));

        }

    }
    @Then("User logout")
    public void user_logout() {
        System.out.println("User logout!");
    }

}
