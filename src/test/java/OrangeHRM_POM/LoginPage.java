package OrangeHRM_POM;

import CommonTestMethods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage  {

    private final By userNameField = By.xpath("//input[@id='username']");
    private final By passwordField = By.xpath("//input[@id='password']");
    private final By submitButton = By.xpath("//button[@id='submit']");
    WebDriver driver = null;
    BasePage basePage;

    public void enterUserName(String userName) {

        basePage = new BasePage(driver);

        basePage.explicitWait_ElementVisibility(userNameField, 15);
        basePage.setText(userNameField, userName);
    }

    public void enterPassword(String password) {
        basePage.explicitWait_ElementVisibility(passwordField, 15);
        basePage.setText(passwordField, password);
    }

    public void clickSubmit() {
        basePage.clickElement(submitButton);
    }

    public void enterLoginDetails(String userName, String password) {

        basePage = new BasePage(driver);

        basePage.explicitWait_ElementVisibility(userNameField, 5);
        basePage.explicitWait_ElementVisibility(passwordField, 5);
        basePage.setText(userNameField, userName);
        basePage.setText(passwordField, password);
        basePage.clickElement(submitButton);
    }
}
