package POM;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationMessagePageElements extends BasePOM {

    public NotificationMessagePageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/notification_message']")
    private WebElement notificationMessageBtn;

    @FindBy(xpath = "//*[@id='content']/div/h3")
    private WebElement notificationMessagePage;


    @FindBy(xpath = "//a[text()='Click here']")
    private WebElement clickHereLink;

    @FindBy(id = "flash-messages")
    private WebElement successMessage;

    @FindBy(id ="flash-messages")
    private WebElement unsuccessfulMessage;


    public void validateNotificationMessagePage() {

        notificationMessageBtn.click();
        waitUntilVisibleOfElement(notificationMessagePage);
        Assert.assertTrue(notificationMessagePage.isDisplayed());
        Assert.assertTrue(notificationMessagePage.getText().toLowerCase().contains("Notification".toLowerCase()));

    }

    public void userClickOnTheLink() {


        waitUntilVisibleAndClickableAndThenClick(clickHereLink);

    }

    public void userDoubleClickOnTheLink(){
        Actions actions = new Actions(driver);
        actions.doubleClick(clickHereLink).click().build().perform();
    }
    public void validateUnsuccessfulMessage(){

        Assert.assertTrue(unsuccessfulMessage.isDisplayed());

    }

    public void validateSuccessMessage() {

        Assert.assertTrue(successMessage.isDisplayed());

    }

}
