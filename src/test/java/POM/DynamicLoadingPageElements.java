package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPageElements extends BasePOM {

    public DynamicLoadingPageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Dynamic Loading']")
    private WebElement dynamicLoadingBtn;

    @FindBy(xpath = "//h3[text()='Dynamically Loaded Page Elements']")
    private WebElement dynamicLoadingPage;

    @FindBy(xpath = "//a[text()='Example 1: Element on page that is hidden']")
    private WebElement example1;

    @FindBy(xpath = "//h4[text()='Example 1: Element on page that is hidden']")
    private WebElement example1Text;

    @FindBy(xpath = "//button[text()='Start']")
    private WebElement startButton;

    @FindBy(xpath = "//h4[text()='Hello World!']")
    private WebElement helloWorldText;

    @FindBy(xpath = "//a[text()='Example 2: Element rendered after the fact']")
    private WebElement example2;

    @FindBy(xpath = "//h4[text()='Example 2: Element rendered after the fact']")
    private WebElement example2Text;

    public void validationDynamicLoadingPage(){
        dynamicLoadingBtn.click();
        waitUntilVisibleOfElement(dynamicLoadingPage);

        Assert.assertTrue(dynamicLoadingPage.isDisplayed());
        Assert.assertTrue(dynamicLoadingPage.getText().toLowerCase().contains("Loaded".toLowerCase()));
    }

    public void userClickExample1(){
        example1.click();
    }

    public void verifyTheExample1OnThePage(){
        waitUntilVisibleOfElement(example1Text);
        Assert.assertTrue(example1Text.isDisplayed());
        Assert.assertTrue(example1Text.getText().toLowerCase().contains("hidden".toLowerCase()));
    }

    public void userClickStartButton(){
        waitUntilVisibleAndClickableAndThenClick(startButton);
    }

    public void successfullyGetTheMessage(){

        waitUntilVisibleOfElement(helloWorldText);
        Assert.assertTrue(helloWorldText.isDisplayed());
        Assert.assertTrue(helloWorldText.getText().toLowerCase().contains("Hello".toLowerCase()));

    }

    public void userClickExample2(){
        example2.click();
    }

    public void verifyTheExample2OnThePage(){
        waitUntilVisibleOfElement(example2Text);
        Assert.assertTrue(example2Text.isDisplayed());
        Assert.assertTrue(example2Text.getText().toLowerCase().contains("rendered ".toLowerCase()));
    }



}
