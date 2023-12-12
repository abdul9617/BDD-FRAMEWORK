package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/Login.feature", glue = "StepDefination", dryRun = false, monochrome = false, plugin = {
		"pretty" })
public class Testrun {

}
