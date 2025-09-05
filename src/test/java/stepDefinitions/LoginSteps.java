package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is on Login Page")
    public void user_is_on_login_page() {
        System.out.println("Login");
    }

    @When("user enters userName and passWord")
    public void user_enters_user_name_and_pass_word() {
        System.out.println("enter userName and Password");
    }

    @When("user clicks on Login Button")
    public void user_clicks_on_login_button() {
        System.out.println("click on login Button");
    }

    @Then("user is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        System.out.println("navigate to home page");
    }
}
