package POM;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static sun.plugin.javascript.navig.JSType.Option;

public class BasePOM {

    WebDriver driver = BaseDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));

    public void waitUntilVisibleAndClickableAndThenClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisibleOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void mouseAction(WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }

    public void mouseActionRightClick(WebElement element) {

        Actions actions = new Actions(driver);
        actions.moveToElement(element).contextClick().build().perform();

    }

    public void dragAndDropMouseAction(WebElement element1,WebElement element2) {
        Actions actions = new Actions(driver);
        Action action = actions.clickAndHold(element2).moveToElement(element1).release(element2).build();
        action.perform();
    }

//    public void selectOptionFromDropdown() {

//        Select select = new Select(dropdownMenu);
//        select.selectByVisibleText("Option 1");
//
//        Select selectOption2 = new Select(dropdownMenu);
//        selectOption2.selectByVisibleText("Option 2");

//    public void mouseActionDoubleClick(WebElement element) {
//
//        Actions actions = new Actions(driver);
//        actions.doubleClick(element).build().perform();
//
//    }


}
