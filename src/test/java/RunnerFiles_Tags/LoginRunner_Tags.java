package RunnerFiles_Tags;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/Feature_with_tags", glue = "StepDefinitions_Tags", monochrome = true,
        plugin = {"pretty", "html:target/Cucumber_Reports/login_Runner_Tags.html"},
tags = "@SmokeTest")
public class LoginRunner_Tags extends AbstractTestNGCucumberTests {
}
