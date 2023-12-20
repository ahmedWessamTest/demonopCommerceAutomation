package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //Element variables
    By loginEmailField = By.id("Email");
    By loginPasswordField = By.id("Password");
    By loginButton = By.cssSelector(".button-1.login-button");
    By errorMessageLoginUnsuccessfully = By.cssSelector(".message-error.validation-summary-errors");

    //Functions
    public void enterLoginEmail (String email) {
        enterText(loginEmailField, email);
    }

    public void enterPassword (String password) {
        enterText(loginPasswordField, password);
    }

    public void clickOnLoginButton () {
        clickOnElement(loginButton);
    }

    public void assertOnUserLoginFailedErrorMessage() {
        SoftAssert softAssert = new SoftAssert();
        boolean errorMessageContent = driver.findElement(errorMessageLoginUnsuccessfully).getText().contains("Login was unsuccessful.");
        String errorMessageHexColor= Color.fromString(getColorElement(errorMessageLoginUnsuccessfully)).asHex();
        softAssert.assertTrue(errorMessageContent);
        softAssert.assertEquals(errorMessageHexColor, "#e4434b");
        softAssert.assertAll();
    }
}
