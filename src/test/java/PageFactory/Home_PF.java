package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home_PF {


    WebDriver driver;

    @FindBy (xpath = "(//div/p)[1]")
    WebElement successText;

    public Home_PF(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }
    public void checkHomePageText(){


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOf(successText)).isDisplayed();

        String text = successText.getText();

        System.out.println("Home Page text: " + text);

        if (!successText.isDisplayed()){

            System.out.println("No Home Page text found.");
        }

    }
}
