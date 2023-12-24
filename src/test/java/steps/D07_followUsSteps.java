package steps;

import bases.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class D07_followUsSteps extends TestBase {
    HomePage homePageObject = new HomePage(driver);
    @When("user opens facebook link")
    public void user_opens_facebook_link() {
        homePageObject.clickOnFacebookIcon();
    }

    @Then("{string} is opened in new tab")
    public void is_opened_in_new_tab(String link) {
        homePageObject.assertOnAnotherTabLink(link);
    }

    @When("user opens twitter link")
    public void user_opens_twitter_link() {
        homePageObject.clickOnTwitterIcon();
    }

    @When("user opens rrs link")
    public void user_opens_rrs_link() {
        homePageObject.clickOnRssIcon();
    }

    @When("user opens youtube link")
    public void user_opens_youtube_link() {
        homePageObject.clickOnYoutubeIcon();
    }

}
