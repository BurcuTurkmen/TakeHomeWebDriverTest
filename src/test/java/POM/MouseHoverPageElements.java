package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MouseHoverPageElements extends BasePOM {

    public MouseHoverPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Hovers']")
    private WebElement mouseHoverLink;

    @FindBy(xpath = "//h3[text()='Hovers']")
    private WebElement mouseHoverPage;

    @FindBy(xpath = "(//div[@class='figure'])[1]")
    WebElement firstImage;

    @FindBy(xpath = "(//div[@class='figure'])[2]")
    WebElement secondImage;

    @FindBy(xpath = "(//div[@class='figure'])[3]")
    WebElement thirdImage;

    @FindBy(xpath = "//h5[contains(text(),'name: user1')]")
    WebElement firstUser;

    @FindBy(xpath = "//h5[contains(text(),'name: user2')]")
    WebElement secondUser;

    @FindBy(xpath = "//h5[contains(text(),'name: user3')]")
    WebElement thirdUser;

//    @FindBy(id = "content")
//    WebElement images;
//
//    @FindBy(id = "page-footer")
//    WebElement userInfo;


    public void validationMouseHover() {
        mouseHoverLink.click();
        Assert.assertTrue(mouseHoverPage.isDisplayed());
        Assert.assertTrue(mouseHoverPage.getText().toLowerCase().contains("hovers".toLowerCase()));
    }

    public void mouseHoverOnTheFirstImage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).build().perform();

    }

    public void mouseHoverOnTheSecondImage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(secondImage).build().perform();
    }

    public void mouseHoverOnTheThirdImage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(thirdImage).build().perform();
    }

    public void validateAdditionalInfoForFirstImage() {

        Assert.assertTrue(firstUser.getText().toLowerCase().contains("user1".toLowerCase()));
    }

    public void validateAdditionalInfoForSecondImage() {

        Assert.assertTrue(secondUser.getText().toLowerCase().contains("user2".toLowerCase()));
    }

    public void validateAdditionalInfoForThirdImage() {

        Assert.assertTrue(thirdUser.getText().toLowerCase().contains("user3".toLowerCase()));
    }

}
