package org.stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepDefinition", monochrome = true, dryRun = false, strict = true)
public class TestRunnerHooks {

}
