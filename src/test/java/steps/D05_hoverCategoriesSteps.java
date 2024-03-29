package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import static bases.TestBase.driver;


public class D05_hoverCategoriesSteps {
    HomePage homePageObject = new HomePage(driver);
    @When("hover on random category")
    public void hover_on_random_category() {

    }

    @When("chose random sub-category")
    public void chose_random_sub_category() {

    }

    @Then("show all products that user chose")
    public void show_all_products_that_user_chose() {
        homePageObject.choseAndAssertOnSubCategory();
    }

}
