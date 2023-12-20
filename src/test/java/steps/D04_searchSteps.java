package steps;

import bases.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class D04_searchSteps extends TestBase {
    HomePage homePageObject = new HomePage(driver);
    @When("enter about what he want search like {string}")
    public void enter_about_what_he_want_search_like(String searchingWord) {
        homePageObject.enterSearchData(searchingWord);

    }

    @When("click enter")
    public void click_on_search_button() {
        homePageObject.clickEnterOnSearchField();
    }

    @When("click on product")
    public void click_on_product () {
        homePageObject.clickOnProduct();
    }

    @Then("user get products with his search name {string}")
    public void user_get_products_with_his_search_name(String searchName) {
        homePageObject.assertOnSearchResults(searchName);
    }

    @Then("user get products with his search sku {string}")
    public void user_get_products_with_his_search_sku(String searchSku) {
        homePageObject.assertOnProductSku(searchSku);
    }
}
