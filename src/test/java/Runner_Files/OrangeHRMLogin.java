package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/Features/orangeHRM.feature", glue = "stepDefinitions", monochrome = true,
        plugin = {"pretty", "html:target/Cucumber_Reports/orangeHRMLogin.html"})
public class OrangeHRMLogin extends AbstractTestNGCucumberTests {
}
