package Runner;

/*
Runner class is helping us to run multiple feature files at the same time
 */


import cucumber.api.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@ CucumberOptions (
        tags = {"@Smoke"},
        features = {"src/test/java/FeatureFile"},  // location of featureFiles
        glue = {"StepDefinition"}  // location of step definition
)

public class TestRunnerWithoutTag extends AbstractTestNGCucumberTests {
}
