package org.testrunner;

import org.junit.Test;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(features = "Feature/PreCruiseSpecialityDiningRecommendations_FrequentUser.feature",glue={"org.stepdefinition"} , plugin = {"pretty","html:target/cucumber-result" , "json:target/cucumber-result/test.json" , "junit:target/cucumber-result/cucumber-results.xml"}
)

public class Runner {
	

}



