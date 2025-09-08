package stepDefinitions;

import CommonTestMethods.BasePage;
import OrangeHRM_POM.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;


import io.cucumber.java.en.*;


public class OrangeHRMLogin {

    WebDriver driver = null;
    LoginPage loginPage;
    BasePage basePage;


    String url = "https://practicetestautomation.com/practice-test-login/";

    @Given("user is on the orange hrm login page")
    public void user_is_on_the_orange_hrm_login_page() {
            driver = new ChromeDriver();
            basePage = new BasePage(driver);

            driver.manage().window().maximize();
            driver.get(url);
    }

    @When("^user enters the valid (.*) and (.*)$")
    public void user_enters_the_valid_admin_and_admin123(String userName, String password) {


        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
    }

    @And("user click on the submit button")
    public void user_click_on_the_submit_button() {
        loginPage.clickSubmit();
    }

    @Then("user should navigate to orange hrm home page successfully")
    public void user_should_navigate_to_orange_hrm_home_page_successfully() {
        String title = driver.getTitle();
        String currentTitle = driver.getCurrentUrl();
        System.out.println("Title: " + title);
        System.out.println("current URL: " + currentTitle);
        if (driver != null) {
            driver.quit();
        }
    }
}
