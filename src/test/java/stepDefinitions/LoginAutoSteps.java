package stepDefinitions;

import CommonTestMethods.BasePage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutoSteps {


     WebDriver driver;
     BasePage basePage;

    private final By userNameField = By.xpath("//input[@id='username']");
    private final By passWordField = By.xpath("//input[@id='password']");
    private final By submitButton = By.xpath("//button[@id='submit']");

    String url = "https://practicetestautomation.com/practice-test-login/";



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        driver = new ChromeDriver();

        basePage = new BasePage(driver);

        driver.manage().window().maximize();

        driver.get(url);


    }
    @When("I enter username {string} and password {string}")
    public void user_enters_valid_student_and_password123(String userName, String password) {

        basePage.setText(userNameField, userName );
        basePage.setText(passWordField, password);

    }
    @And("click on the submit button")
    public void click_on_the_submit_button() {
        basePage.clickElement(submitButton);
    }
    @Then("user should navigate to home page successfully")
    public void user_should_navigate_to_home_page_successfully() {
            String successMessage = basePage.findElement(By.xpath("//h1[@class='post-title']")).getText();
        System.out.println(successMessage);
    }
}
