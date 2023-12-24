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

    public void waitForElementPresence(By elementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    public void scrollToElementView (By elementLocator) {
        WebElement element = driver.findElement(elementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void enterText (By elementLocator, String text) {
        scrollToElementView(elementLocator);
        waitForElementPresence(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }

    public void clickOnElement (By elementLocator) {
        scrollToElementView(elementLocator);
        waitForElementPresence(elementLocator);
        driver.findElement(elementLocator).click();
    }
    public String getColorElement (By elementLocator) {
        waitForElementPresence(elementLocator);
       return driver.findElement(elementLocator).getCssValue("color");
    }

    public boolean chickElementDisplayed(By elementLocator) {
        scrollToElementView(elementLocator);
        waitForElementPresence(elementLocator);
        return driver.findElement(elementLocator).isDisplayed();
    }

}
