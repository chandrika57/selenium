package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//91733//IdeaProjects//SeleniumCucumber//Features//Login.feature",
        glue="StepDefinition",
       dryRun = true,
        plugin = {"pretty","html:target/cucumber-reports"}
  
)



public class TestRunner {
}
