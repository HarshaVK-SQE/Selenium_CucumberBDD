package Runner_Files;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (plugin = {"pretty", "html:target/cucumber.html"}, features = "src/test/Features", glue = "stepDefinitions", monochrome = true)

public class GoogleSearchTestRunner extends AbstractTestNGCucumberTests {
}
