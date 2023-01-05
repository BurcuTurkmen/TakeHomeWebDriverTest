package POM;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePageElements extends BasePOM {

    public IframePageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement FramesLink;

    @FindBy(xpath = "//a[text()='iFrame']")
    private WebElement iFrameLink;

    @FindBy(xpath = "//button[@type='button']//div[@aria-label='Close']")
    WebElement closeButton;

    @FindBy(id = "mce_0_ifr")
    WebElement iframe;

    @FindBy(id = "tinymce")
    WebElement textBox;

    public void validateIframePage() {

        FramesLink.click();
        iFrameLink.click();
    }

    public void userTypeIntoIframe() {
        closeButton.click();
        driver.switchTo().frame(iframe);
        Actions actions = new Actions(driver);
        textBox.clear();
        actions.sendKeys("Hello").build().perform();
    }

    public void validateTextInIframe() {

        Assert.assertTrue(textBox.getText().toLowerCase().contains("hello".toLowerCase()));

    }


}
