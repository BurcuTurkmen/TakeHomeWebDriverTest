package POM;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingMenuPageElements extends BasePOM {

    public FloatingMenuPageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Floating Menu']")
    private WebElement floatingMenuBtn;

    @FindBy(xpath = "//h3[text()='Floating Menu']")
    private WebElement floatingMenuPage;

    @FindBy(xpath = "//a[text()='Home']")
    private WebElement validateHomeTopPage;


    public void validationFloatingMenuPage(){
        floatingMenuBtn.click();
        waitUntilVisibleOfElement(floatingMenuPage);

        Assert.assertTrue(floatingMenuPage.isDisplayed());
        Assert.assertTrue(floatingMenuPage.getText().toLowerCase().contains("Floating".toLowerCase()));
    }

    public void scrollThePage(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

    }

    public void verifyTheFloatingMenuIsStillDisplayed(){
        Assert.assertTrue(validateHomeTopPage.isDisplayed());
        Assert.assertTrue(validateHomeTopPage.getText().contains("Home"));

    }

}
