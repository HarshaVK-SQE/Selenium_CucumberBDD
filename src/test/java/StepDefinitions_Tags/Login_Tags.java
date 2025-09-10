package StepDefinitions_Tags;

import PageFactory_Tags.Login_PF;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Tags {

    Login_PF loginPf;
    WebDriver driver = null;
    String url = "https://practicetestautomation.com/practice-test-login/";



    @Given("user lands on the login page")
    public void user_lands_on_the_login_page() {

        loginPf = new Login_PF();
        driver = new ChromeDriver();

        loginPf.setDriver(driver);

        driver.manage().window().maximize();

        driver.get(url);

    }
    @When("^user enters the valid (.*) and (.*)$")
    public void user_enters_valid_details(String userName, String password) {

        loginPf.enterUserName(userName);
        loginPf.enterPassword(password);

    }
    @And("user click on the submit button")
    public void user_click_on_the_submit_button() {

        loginPf.clickSubmit();
    }
    @Then("user should navigate to the home page.")
    public void user_should_navigate_to_the_home_page() {
        System.out.println("User landed on Home Page.");
    }
}
