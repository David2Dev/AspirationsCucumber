package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

@RunWith(Cucumber.class)

@CucumberOptions (features = { "src/test/java/feature"} , glue= "stepDefinitions", monochrome = true)


public class TestRunner {

}

