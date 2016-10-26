package test_Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(features = {"Feature/InabilitytoSaveAlphaAlphaNumeric_84385.feature"}
,glue={"step_definition"} , plugin = {"pretty","html:target/cucumber-result" , "json:target/cucumber-result/test.json" , "junit:target/cucumber-result/cucumber-results.xml" }
)

public class Runner {

}  
