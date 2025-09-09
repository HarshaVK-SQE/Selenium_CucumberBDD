package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {

    WebDriver driver;

    @FindBy (xpath = "//input[@id='username']")
    WebElement userNameField;

    @FindBy (xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy (xpath = "//button[@id='submit']")
    WebElement submitButton;

    public Login_PF(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }


    public void enterUserName(String userName){

        userNameField.sendKeys(userName);

    }

    public void enterPassword(String password){

        passwordField.sendKeys(password);

    }

    public void clickSubmit(){

        submitButton.click();

    }

}
