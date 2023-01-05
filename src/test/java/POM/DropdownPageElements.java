package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;

public class DropdownPageElements extends BasePOM{

    public DropdownPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Dropdown']")
    private WebElement dropdownLink;

    @FindBy(xpath = "//h3[text()='Dropdown List']")
    private WebElement dropdownPage;

    @FindBy(id = "dropdown")
    private WebElement dropdownMenu;

    @FindBy(css = "#dropdown > option:nth-child(2)")
    private WebElement option1;

    @FindBy(xpath = "//option[@selected='selected']/text()")
    private WebElement option1Selected;

    @FindBy(css = "#dropdown > option:nth-child(3)")
    private WebElement option2;

    @FindBy(xpath = "//option[@selected='selected']/text()")
    private WebElement option2Selected;



    public void validateDropdownPage() {

        dropdownLink.click();
        waitUntilVisibleOfElement(dropdownPage);
        Assert.assertTrue(dropdownPage.isDisplayed());
        Assert.assertTrue(dropdownPage.getText().toLowerCase().contains("dropdown".toLowerCase()));

    }

    public void userSelectTheOption1(){

        Select select = new Select(dropdownMenu);
        select.selectByVisibleText("Option 1");

    }

    public void verifyTheOption1IsSelected(){

        waitUntilVisibleOfElement(option1Selected);
        Assert.assertTrue(option1Selected.isSelected());
    }

    public void userSelectTheOption2(){

        Select select = new Select(dropdownMenu);
        select.selectByVisibleText("Option 2");

    }

    public void verifyTheOption2IsSelected(){

        waitUntilVisibleOfElement(option2Selected);
        Assert.assertTrue(option2Selected.isSelected());
    }

}

