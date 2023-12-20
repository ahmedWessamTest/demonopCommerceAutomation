package steps;

import bases.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;

public class D01_userRegistrationSteps extends TestBase {
    RegistrationPage registrationPageobject = new RegistrationPage(driver);
    HomePage homePageobject = new HomePage(driver);
    @Given("user go to register page")
    public void user_go_to_register_page() {
        homePageobject.clickOnRegisterButton();
    }
    @When("user select gender type")
    public void user_select_gender_type() {
        registrationPageobject.selectGenderType("Male");
    }

    @When("user enter first name {string} and last name {string}")
    public void user_enter_first_name_and_last_name(String firstName, String lastName) {
        registrationPageobject.enterFirstNameField(firstName);
        registrationPageobject.enterLastNameField(lastName);
    }

    @When("user enter date of birth")
    public void user_enter_date_of_birth() {
        registrationPageobject.selectDayOfBirth("18");
        registrationPageobject.selectMonthOfBirth("August");
        registrationPageobject.selectYearOfBirth("2001");

    }

    @When("user enter email {string} field")
    public void user_enter_email_field(String email) {
        registrationPageobject.enterEmailField(email);
    }

    @When("user fills password fields {string}{string}")
    public void user_fills_password_fields(String password,String confirmPassword ) {
        registrationPageobject.enterPasswordField(password);
        registrationPageobject.enterConfirmationPasswordField(confirmPassword);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        registrationPageobject.clickOnRegisterButton();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        registrationPageobject.assertionOnSuccessMessageIsDisplayed();
    }
}
