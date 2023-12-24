package steps;

import bases.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class D06_homeSlidersSteps extends TestBase {
    HomePage homePageObject = new HomePage(driver);
    @When("click on samsung Galaxy S22 slider imag")
    public void click_on_samsung_galaxy_s22_slider_imag() {
        homePageObject.clickOnSamsungHomeSlider();
    }

    @Then("user go to product who clicked with {string} URL")
    public void user_go_to_product_who_clicked_with_url(String link) {
        homePageObject.assertOnHomeSliderImageLink(link);
    }

    @When("click on samsung Galaxy iphone {int} pro imag")
    public void click_on_samsung_galaxy_iphone_pro_imag(Integer int1) {
        homePageObject.clickOnIphoneOnHomeSlider();
    }

}
