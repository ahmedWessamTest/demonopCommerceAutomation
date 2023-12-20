package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class playGround extends TestBase {
    @Test
    public void test1() {
        By subCategoriesList = By.cssSelector(".sublist.first-level > li");
        By categoriesList = By.cssSelector(".top-menu.notmobile > li");
        int randomIndex = new Random().nextInt(3);
        int randomsubIndex = new Random().nextInt(3);
        Actions actions = new Actions(driver);
        List<WebElement> categoriesElements = driver.findElements(categoriesList);
        WebElement randomCategoryElement = categoriesElements.get(randomIndex);
        actions.moveToElement(randomCategoryElement).perform();
        List<WebElement> subCategoriseElements =  randomCategoryElement.findElements(subCategoriesList);
        WebElement randomSubCategoryText = subCategoriseElements.get(randomIndex);
        System.out.println(randomSubCategoryText.getText());
        randomSubCategoryText.click();

        }
    }

