package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPageElements extends BasePOM {

    public DynamicControlsPageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Dynamic Controls']")
    private WebElement dynamicControlsBtn;

    @FindBy(xpath = "//h4[text()='Dynamic Controls']")
    private WebElement dynamicControlsPage;

    @FindBy(xpath = "//*[@id='checkbox']/input") // id='checkbox'
    private WebElement checkbox;

    @FindBy(xpath = "//button[text()='Remove']")
    private WebElement removeBtn;

    @FindBy(id = "message") ////*[@id='message']/text()
    private WebElement itsGone;

    @FindBy(xpath = "//button[text()='Add']")
    private WebElement addButton;

    @FindBy(id = "message") // (xpath = "//p[text()='It's back!']")
    private WebElement itsBack;

    @FindBy(xpath = "//button[text()='Enable']")
    private WebElement enableBtn;

    @FindBy(xpath = "//*[@id='message']")
    private WebElement itsEnabledText;

    @FindBy(xpath = "//p[text()='checkbox']")
    private WebElement checkboxText;

    @FindBy(xpath = "//button[text()='Disable']")
    private WebElement disableBtn;

    @FindBy(xpath = "//p[text()='It's disabled!']")
    private WebElement itsDisabledText;

    public void validationDynamicControlsPage(){
        dynamicControlsBtn.click();
        waitUntilVisibleOfElement(dynamicControlsPage);

        Assert.assertTrue(dynamicControlsPage.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.getText().toLowerCase().contains("Controls".toLowerCase()));
    }

    public void userClickToRemoveButton(){

        waitUntilVisibleOfElement(removeBtn);
        mouseAction(removeBtn);
    }

    public void userSuccessfullyRemovedTheCheckbox(){

        waitUntilVisibleOfElement(itsGone);
        Assert.assertTrue(itsGone.isDisplayed());
        String expectedResult = "It's gone!";
        Assert.assertEquals(expectedResult,itsGone.getText());

    }

    public void userClickTheAddButton(){
        waitUntilVisibleOfElement(addButton);
        mouseAction(addButton);
    }

    public void userSuccessfullyAddedTheCheckbox(){

        waitUntilVisibleOfElement(itsBack);
        Assert.assertTrue(itsBack.isDisplayed());
        String expectedResult = "It's back!";
        Assert.assertEquals(expectedResult,itsBack.getText());

    }

    public void userClickTheEnableButton(){
        waitUntilVisibleOfElement(enableBtn);
        mouseAction(enableBtn);
    }

    public void userSuccessfullyEnabled(){

        waitUntilVisibleOfElement(itsEnabledText);
        Assert.assertTrue(itsEnabledText.isEnabled());
        String expectedResult = "It's enabled!";
        Assert.assertEquals(expectedResult,itsEnabledText.getText());

    }

    public void userClickTheDisableButton(){
        waitUntilVisibleOfElement(disableBtn);
        mouseAction(disableBtn);
    }

    public void userSuccessfullyDisabled(){

        waitUntilVisibleOfElement(itsDisabledText);
        Assert.assertTrue(itsDisabledText.isDisplayed());
        String expectedResult = "It's disabled!";
        Assert.assertEquals(expectedResult,itsDisabledText.getText());

    }

}
