package CommonTestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    public static WebDriver driver;

    public void setDriver(WebDriver driver){

        BasePage.driver= driver;


    }

    public WebElement findElement(By locator){

       return driver.findElement(locator);
    }

    public void setText(By locator, String enterText){

        findElement(locator).clear();
        findElement(locator).sendKeys(enterText);

    }

    public void clickElement(By locator){
        findElement(locator).click();
    }

    public void implicitWait(long millis){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(millis));
    }

    public void explictWait_ElementVisibility(By locator, long millis){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(millis));

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void explicitWait_ClickElement(By locator, long millis){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(millis));

        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }



}
