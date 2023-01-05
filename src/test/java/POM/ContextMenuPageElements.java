package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPageElements extends BasePOM {

    public ContextMenuPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Context Menu']")
    private WebElement contextMenuLink;

    @FindBy(xpath = "//h3[text()='Context Menu']")
    private WebElement contextMenuPage;

    @FindBy(id = "hot-spot")
    private WebElement box;

    public void validateContextMenuPage() {

        contextMenuLink.click();
        waitUntilVisibleOfElement(contextMenuPage);
        Assert.assertTrue(contextMenuPage.isDisplayed());
        Assert.assertTrue(contextMenuPage.getText().toLowerCase().contains("context".toLowerCase()));

    }

    public void userRightClickInTheBox() {

        mouseActionRightClick(box);
    }

    public void userHandleTheJavaScriptAlert() {
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        Assert.assertTrue(alertText.toLowerCase().contains("You selected".toLowerCase()));
    }
}
