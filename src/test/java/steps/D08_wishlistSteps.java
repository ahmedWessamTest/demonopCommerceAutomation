package steps;

import bases.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class D08_wishlistSteps extends TestBase {
    HomePage homePageObject = new HomePage(driver);
    @When("user press on wishlist button")
    public void user_press_on_wishlist_button() {
        homePageObject.clickOnWishListButton();
    }

    @Then("display success message {string} with green background")
    public void display_success_message_with_green_background(String message) {
        homePageObject.asserOnAddToWishListMessage(message);
    }

    @When("user press on add to wishlist button in product")
    public void user_press_on_add_to_wishlist_button_in_product() {
        homePageObject.clickOnAddToWishListButton();
    }

    @Then("user get Qty value {int} or more")
    public void user_get_qty_value_or_more(Integer int1) {
        homePageObject.asserOnQtyBigThenOne();
    }
}
