package PageFactory_Tags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {

    public static WebDriver driver;

    @FindBy (xpath = "//input[@id='username']")
    WebElement usernameFiled;

    @FindBy (xpath = "//input[@id='password']")
    WebElement passwordFiled;

    @FindBy (xpath = "//button[@id='submit']")
    WebElement submitButton;

    public void setDriver(WebDriver driver){

        Login_PF.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public void enterUserName(String userName){

        usernameFiled.sendKeys(userName);

    }

    public void enterPassword(String password){

        passwordFiled.sendKeys(password);

    }

    public void clickSubmit(){

        submitButton.click();

    }
}
