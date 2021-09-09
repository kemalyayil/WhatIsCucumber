package Runner;


import cucumber.api.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions (
        tags = {"@Smoke"},
        features = {"src/test/java/FeatureFile/Login.feature","src/test/java/FeatureFile/Search.feature"},  // location of multiple featureFiles
        glue = {"StepDefinition"}  // location of step definition

)

public class TestRunnerForMultipleFeatures extends AbstractTestNGCucumberTests{

}
