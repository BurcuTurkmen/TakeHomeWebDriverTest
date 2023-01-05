package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckAndUncheckPageElements extends BasePOM {

   public CheckAndUncheckPageElements() {
       PageFactory.initElements(driver, this);

   }

    @FindBy(xpath = "//a[text()='Checkboxes']")
    private WebElement checkboxButton;
    @FindBy(xpath = "//h3[text()='Checkboxes']")
    private WebElement checkboxPage;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//*[@id='checkboxes']/input[1]")
    private WebElement verifyCheckbox1;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement checkbox2;

    @FindBy(xpath = "//*[@id='checkboxes']/input[2]")
    private WebElement verifyCheckbox2;


    public void validationCheckboxPage(){

        checkboxButton.click();
        waitUntilVisibleOfElement(checkboxPage);
        Assert.assertTrue(checkboxPage.isDisplayed());
        Assert.assertTrue(checkboxPage.getText().toLowerCase().contains("Checkbox".toLowerCase()));
    }


    public void UserCheckTheCheckbox1(){

        mouseAction(checkbox1);
    }

    public void verifyCheckbox1(){

        waitUntilVisibleOfElement(verifyCheckbox1);
        Assert.assertTrue(verifyCheckbox1.isSelected());
    }

    public void UserUnCheckTheCheckbox2(){

        mouseAction(checkbox2);
    }

    public void verifyCheckbox2(){

        waitUntilVisibleOfElement(verifyCheckbox2);
        Assert.assertTrue(verifyCheckbox2.isSelected());
    }

}
