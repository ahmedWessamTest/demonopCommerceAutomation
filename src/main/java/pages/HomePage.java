package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    // Element variables
    By registerButton = By.className("ico-register");
    By logInButton = By.className("ico-login");
    By myAccountButton = By.className("ico-account");
    String homepageURL = "https://demo.nopcommerce.com/";
    By customerCurrencyDropdown = By.id("customerCurrency");
    By productPrice = By.cssSelector(".price.actual-price");
    By searchBar = By.name("q");
    By productTitle = By.cssSelector(".product-title");
    By productItem = By.className("product-item");
    By productSku = By.className("sku");
    By categoriesList = By.cssSelector(".top-menu.notmobile > li");
    By subCategoriesList = By.cssSelector(".sublist.first-level > li");
    By productPageTitle = By.className("page-title");
    By homeSlider = By.xpath("//div[@id=\"nivo-slider\"]");
    By homeSliderDots = By.xpath("//div[@class=\"nivo-controlNav\"]//a");
    By followUsFacebookIcon = By.xpath("//li[@class=\"facebook\"]//a");
    By followUsTwitterIcon = By.xpath("//li[@class=\"twitter\"]//a");
    By followUsRssIcon = By.xpath("//li[@class=\"rss\"]//a");
    By followUsYoutubeIcon = By.xpath("//li[@class=\"youtube\"]//a");




    //functions
    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void clickOnLogInButton() {
        clickOnElement(logInButton);
    }

    public void assertIfUserLoginSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        String homePageCurrentUrl = driver.getCurrentUrl();
        boolean myAccountElementIsDisplayed = chickElementDisplayed(myAccountButton);
        softAssert.assertEquals(homePageCurrentUrl,homepageURL);
        softAssert.assertTrue(myAccountElementIsDisplayed);
        softAssert.assertAll();
    }

    public void assertOnHomePageURL () {
        String CurrentUrl = driver.getCurrentUrl();
        Assert.assertEquals(CurrentUrl,homepageURL);
    }

    public void selectCustomerCurrencies (String text) {
        Select select = new Select(driver.findElement(customerCurrencyDropdown));
        select.selectByVisibleText(text);
    }

    public void assertOnCurrenciesSignChange (String sign) {
        List<WebElement> elements = driver.findElements(productPrice);
        for (WebElement e : elements) {
           String currenciesSign= String.valueOf(e.getText().charAt(0));
           Assert.assertEquals(currenciesSign, sign);
        }
    }

    public void enterSearchData (String text) {
        enterText(searchBar, text);
    }

    public void clickEnterOnSearchField () {
        enterText(searchBar, String.valueOf(Keys.ENTER));
    }

    public void assertOnSearchResults (String expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productsElement = driver.findElements(productTitle);
        for (WebElement e : productsElement) {
            boolean productContainExpected = e.getText().toLowerCase().contains(expectedResult);
            softAssert.assertTrue(productContainExpected,"result not equal search");
        }
        boolean currentLinkContain = driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=");
        softAssert.assertTrue(currentLinkContain);
    }

    public void clickOnProduct () {
        clickOnElement(productItem);
    }

    public void assertOnProductSku (String sku) {
        String productSkuTitle = driver.findElement(productSku).getText();
        Assert.assertEquals(productSkuTitle, "SKU: "+sku);
    }

//    public  void hoverOnRandomCategory() {
//
//    }
//
//    public void clickOnRandomSubCategory () {
//
//    }
//
//    public void assertOnSubCategoryResults () {
//
//    }

    public void choseAndAssertOnSubCategory() {
        int randomCategoryIndex = new Random().nextInt(3);
        int randomSubCategoryIndex = new Random().nextInt(3);
        Actions actions = new Actions(driver);

        List<WebElement> categoryElements = driver.findElements(categoriesList);
        WebElement randomCategoryElement = categoryElements.get(randomCategoryIndex);
        actions.moveToElement(randomCategoryElement).perform();

        List<WebElement> subCategoriseElements = randomCategoryElement.findElements(subCategoriesList);
        WebElement randomSubCategoryElement = subCategoriseElements.get(randomSubCategoryIndex);
        String randomSubCategoryContent = randomSubCategoryElement.getText();
        randomSubCategoryElement.click();

        String productPageTitleContent = driver.findElement(productPageTitle).getText();
        Assert.assertEquals(randomSubCategoryContent, productPageTitleContent);
    }
    public void clickOnIphoneOnHomeSlider(){
        clickOnElement(homeSlider);
    }

    public void clickOnSamsungHomeSlider (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> dots = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='nivo-controlNav']//a")));
        dots.get(1).click();
    }


    public void assertOnHomeSliderImageLink(String link) {
        String getCurrentURL = driver.getCurrentUrl();
        Assert.assertEquals(getCurrentURL, link);
    }
    public void clickOnFacebookIcon () {
        clickOnElement(followUsFacebookIcon);
    }

    public void clickOnTwitterIcon () {
        clickOnElement(followUsTwitterIcon);
    }

    public void clickOnRssIcon () {
        clickOnElement(followUsRssIcon);
    }

    public void clickOnYoutubeIcon () {
        clickOnElement(followUsYoutubeIcon);
    }

    public void assertOnAnotherTabLink (String link) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, link);
    }
}
