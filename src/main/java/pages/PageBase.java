package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PageBase {
     WebDriver driver;
    public PageBase (WebDriver driver) {
        this.driver = driver;
    }

    protected void waitForElementPresence(By elementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    protected void enterText (By elementLocator, String text) {
        waitForElementPresence(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }

    protected void clickOnElement (By elementLocator) {
        waitForElementPresence(elementLocator);
        driver.findElement(elementLocator).click();
    }
    protected String getColorElement (By elementLocator) {
        waitForElementPresence(elementLocator);
       return driver.findElement(elementLocator).getCssValue("color");
    }

    protected boolean chickElementDisplayed(By elementLocator) {
        waitForElementPresence(elementLocator);
        return driver.findElement(elementLocator).isDisplayed();
    }

}
