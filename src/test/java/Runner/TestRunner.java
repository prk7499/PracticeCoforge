package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"FeaturesFolder"},
		glue = {"StepDefination"},
		dryRun =false,
		plugin ={"html:target/cucumber-reports"},
		monochrome = true,
        publish = true
		
		
		)
public class TestRunner {

}
