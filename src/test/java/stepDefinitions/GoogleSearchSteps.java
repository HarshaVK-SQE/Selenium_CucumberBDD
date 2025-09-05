package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

public class GoogleSearchSteps {

    WebDriver driver = new ChromeDriver();

    @Given("user navigated is on the Google Search")
    public void user_navigated_is_on_the_google_search() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.get("https://www.google.co.in");

    }
    @When("user enters the search text")
    public void user_enters_the_search_text() {

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Gal gadot" + Keys.ENTER);


    }
    @When("user click on the search button")
    public void user_click_on_the_search_button() {
        System.out.println("This method handled in @When ('user enters the search text')");
    }
    @Then("user is navigated to search page")
    public void user_is_navigated_to_search_page() {
       String st = String.valueOf(driver.getPageSource().contains("Israeli actress"));

        System.out.println(st);
    }
}
