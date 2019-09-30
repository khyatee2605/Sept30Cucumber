package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "Features\\LoginPOM.feature",
		glue= {"stepDefinition"},
		plugin= {"json:target/cucumber-reports/Report.json"}
		)

public class LoginPOMRunner {

}
