package Runner_Files;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/Features", glue = "stepDefinitions", monochrome = true,plugin = {"pretty", "html:target/Cucumber_Reports/cucumber.html"})
public class Login_PF_Runner extends AbstractTestNGCucumberTests {

}
