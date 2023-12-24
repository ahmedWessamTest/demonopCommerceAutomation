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
import java.util.List;
import java.util.Random;

public class playGround extends TestBase {
    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);

        List<WebElement> dots = driver.findElements(By.xpath("//div[@class=\"nivo-controlNav\"]//a"));


//        By dotsNotActive = By.xpath("//a[@class=\"nivo-control\"]");
        dots.get(1).click();
//        HomePage homePage = new HomePage(driver);
//        homePage.clickOnElement((By) dots.get(1));


        }
    }

