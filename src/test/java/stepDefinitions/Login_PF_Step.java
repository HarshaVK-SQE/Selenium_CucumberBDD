package stepDefinitions;

import PageFactory.Home_PF;
import PageFactory.Login_PF;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_PF_Step {

    WebDriver driver = null;
    Login_PF loginPf;
    Home_PF homePf;

    String url = "https://practicetestautomation.com/practice-test-login/";

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        loginPf = new Login_PF(driver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String userName, String password) {
        loginPf = new Login_PF(driver);

        loginPf.enterUserName(userName);
        loginPf.enterPassword(password);

    }

    @When("click on the submit button")
    public void click_on_the_submit_button() {

        loginPf.clickSubmit();

    }

    @Then("user should navigate to home page successfully")
    public void user_should_navigate_to_home_page_successfully() {
        homePf = new Home_PF(driver);

        homePf.checkHomePageText();

    }
}
