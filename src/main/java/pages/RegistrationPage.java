package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    //Elements Variables
    By genderMaleChickBox = By.className("male");
    By genderFemaleChickBox = By.className("female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDayDropdown = By.name("DateOfBirthDay");
    By dateOfBirthMonthDropdown = By.name("DateOfBirthMonth");
    By dateOfBirthYearDropDown = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmationPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerSuccessMessage = By.xpath("//div[@class= \"result\"]");
    //functions
    public void selectGenderType(String gender) {
        if (gender == "Male") {
            clickOnElement(genderMaleChickBox);
        }else if (gender == "Female") {
            clickOnElement(genderFemaleChickBox);
        }
    }

    public void enterFirstNameField(String text) {
        enterText(firstNameField,text);
    }

    public void enterLastNameField(String text) {
        enterText(lastNameField, text);
    }

    public void selectDayOfBirth (String visibleText) {
        Select select = new Select(driver.findElement(dateOfBirthDayDropdown));
        select.selectByVisibleText(visibleText);
    }

    public void selectMonthOfBirth (String visibleText) {
        Select select = new Select(driver.findElement(dateOfBirthMonthDropdown));
        select.selectByVisibleText(visibleText);
    }

    public void selectYearOfBirth (String visibleText) {
        Select select = new Select(driver.findElement(dateOfBirthYearDropDown));
        select.selectByVisibleText(visibleText);
    }

    public void enterEmailField (String text) {
        enterText(emailField, text);
    }

    public void enterPasswordField (String text) {
        enterText(passwordField, text);
    }

    public void enterConfirmationPasswordField (String text) {
        enterText(confirmationPassword, text);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void assertionOnSuccessMessageIsDisplayed () {
        SoftAssert softAssert = new SoftAssert();
        String messageColor = getColorElement(registerSuccessMessage);
        String textMessage = driver.findElement(registerSuccessMessage).getText();
        softAssert.assertEquals(textMessage, "Your registration completed");
        softAssert.assertEquals(messageColor, "rgba(76, 177, 124, 1)");
        softAssert.assertAll();
    }

}
