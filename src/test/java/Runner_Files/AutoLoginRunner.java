package Runner_Files;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, features = "src/test/Features/automationLogin.feature",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/Cucumber_Reports/autoLogin.html"})

public class AutoLoginRunner extends AbstractTestNGCucumberTests {
}
