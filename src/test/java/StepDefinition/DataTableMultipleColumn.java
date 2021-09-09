package StepDefinition;

import io.cucumber.java.en.When;

import java.util.List;

public class DataTableMultipleColumn {

    @When("User enter email")
    public void user_enter_email(io.cucumber.datatable.DataTable dataTable) {
       List<List<String>> listOfList = dataTable.cells();   // 2d arraylist olusturuluyor feature file da
                                                            // vermis oldugumuz veriler isiginda.
        for (int i = 0; i < listOfList.size(); i++) {

            String email = listOfList.get(i).get(0);
            String expectedResult = listOfList.get(i).get(1);

            System.out.println("User enter email -- >  " + email + " and expected result is " + expectedResult);
        }

        /*
        Data Table
        {{"11223334", "Fail"}, {"ahsdgadas", "Fail"}, {"!@#@#$$%", "Fail"}, {"asda@gmail.com", "Passed"}}
         */
    }
}
