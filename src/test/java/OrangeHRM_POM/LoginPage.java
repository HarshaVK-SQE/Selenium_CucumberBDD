package OrangeHRM_POM;

import CommonTestMethods.BasePage;
import org.openqa.selenium.By;




public class LoginPage extends BasePage {

    private final By userNameField = By.xpath("//input[@placeholder='Username']");
    private final By passwordField = By.xpath("//input[@placeholder='Password']");
    private final By submitButton = By.xpath("//button[@type='submit']");

    public void enterUserName(String userName) {
        explicitWait_ElementVisibility(userNameField, 5);
        setText(userNameField, userName);
    }

    public void enterPassword(String password) {
        explicitWait_ElementVisibility(passwordField, 5);
        setText(passwordField, password);
    }

    public void clickSubmit() {
        clickElement(submitButton);
    }

    public void enterLoginDetails(String userName, String password) {
        explicitWait_ElementVisibility(userNameField, 5);
        explicitWait_ElementVisibility(passwordField, 5);
        setText(userNameField, userName);
        setText(passwordField, password);
        clickElement(submitButton);
    }
}
