package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import static bases.TestBase.driver;

public class D03_currenciesSteps {

    HomePage homePageObject = new HomePage(driver);
    @Given("user in home page")
    public void user_in_home_page() {
        homePageObject.assertOnHomePageURL();
    }

    @When("select {string} currency")
    public void select_euro_currency(String currency) {
        homePageObject.selectCustomerCurrencies(currency);
    }

    @Then("all products change to Euro currency and change sign to {string}")
    public void all_products_change_to_euro_currency_and_change_sign_to(String sign) {
        homePageObject.assertOnCurrenciesSignChange(sign);
    }
}
