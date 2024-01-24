package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

import static bases.TestBase.driver;

public class D02_userLoginSteps {
    HomePage homePageObject = new HomePage(driver);
    LoginPage loginPageObject = new LoginPage(driver);
    @Given("user go to login page")
    public void user_go_to_login_page() {
        homePageObject.clickOnLogInButton();
    }

    @When("user login with {string} {string} and {string}")
    public void user_login_with_and(String validation, String email, String password) {
        loginPageObject.enterLoginEmail(email);
        loginPageObject.enterPassword(password);
        System.out.println("Validation type: "+ validation);
    }

    @When("user press on login button")
    public void user_press_on_login_button() {
        loginPageObject.clickOnLoginButton();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        homePageObject.assertIfUserLoginSuccessfully();
    }
    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        loginPageObject.assertOnUserLoginFailedErrorMessage();
    }
}
