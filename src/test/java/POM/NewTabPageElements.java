package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewTabPageElements extends BasePOM{

    public NewTabPageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[text()= 'Opening a new window']")
    private WebElement newTabPageText;

    @FindBy(xpath = "//a[text()= 'Click Here']")
    private WebElement clickHere;

    @FindBy(xpath = "//h3[text()= 'New Window']")
    private WebElement newWindowSuccessText;

    @FindBy(xpath = "/html/body/div/h3")
    private WebElement newUrl;


    public void validateNewTabPage(){
        driver.get("http://localhost:7080/windows");
        waitUntilVisibleOfElement(newTabPageText);
        Assert.assertTrue(newTabPageText.isDisplayed());
        String expectedText = "Opening a new window";
        Assert.assertEquals(newTabPageText.getText(), expectedText);
    }

    public void userClickOnTheLink() {
        clickHere.click();

    }

    public void validateNewWindowMessage() {

        String currentUrl = "http://localhost:7080/windows/new";
        Assert.assertTrue(currentUrl.contains("new".toLowerCase()));

    }

}
