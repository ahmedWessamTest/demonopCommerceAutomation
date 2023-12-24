package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PageBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class playGround extends TestBase {
    @Test
    public void test1() throws InterruptedException {
        By followUsFacebookIcon = By.xpath("//li[@class=\"facebook\"]//a");
        HomePage homePage = new HomePage(driver);
        homePage.clickOnElement(followUsFacebookIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println((tabs.size()));

        driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1: "+driver.getCurrentUrl());

        driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0: "+ driver.getCurrentUrl());
    }
    }

