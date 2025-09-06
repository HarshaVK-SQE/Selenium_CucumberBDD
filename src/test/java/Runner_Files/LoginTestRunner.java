package Runner_Files;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/Features", glue = "stepDefinitions", monochrome = true,
plugin = {"pretty", "html:target/cucumber.html"})

public class LoginTestRunner extends AbstractTestNGCucumberTests {


}
