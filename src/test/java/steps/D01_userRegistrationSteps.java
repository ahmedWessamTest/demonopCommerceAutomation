package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;

import static bases.TestBase.driver;

public class D01_userRegistrationSteps {
    RegistrationPage registrationPageObject = new RegistrationPage(driver);
    HomePage homePageObject = new HomePage(driver);
    @Given("user go to register page")
    public void user_go_to_register_page() {
        homePageObject.clickOnRegisterButton();
    }
    @When("user select gender type")
    public void user_select_gender_type() {
        registrationPageObject.selectGenderType("Male");
    }

    @When("user enter first name {string} and last name {string}")
    public void user_enter_first_name_and_last_name(String firstName, String lastName) {
        registrationPageObject.enterFirstNameField(firstName);
        registrationPageObject.enterLastNameField(lastName);
    }

    @When("user enter date of birth")
    public void user_enter_date_of_birth() {
        registrationPageObject.selectDayOfBirth("18");
        registrationPageObject.selectMonthOfBirth("August");
        registrationPageObject.selectYearOfBirth("2001");

    }

    @When("user enter email {string} field")
    public void user_enter_email_field(String email) {
        registrationPageObject.enterEmailField(email);
    }

    @When("user fills password fields {string}{string}")
    public void user_fills_password_fields(String password,String confirmPassword ) {
        registrationPageObject.enterPasswordField(password);
        registrationPageObject.enterConfirmationPasswordField(confirmPassword);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        registrationPageObject.clickOnRegisterButton();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        registrationPageObject.assertionOnSuccessMessageIsDisplayed();
    }
}
