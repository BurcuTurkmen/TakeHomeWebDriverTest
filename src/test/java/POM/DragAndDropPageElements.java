package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class DragAndDropPageElements extends BasePOM{

    public DragAndDropPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Drag and Drop']")
    private WebElement dragAndDropLink;

    @FindBy(xpath = "//h3[text()='Drag and Drop']")
    private WebElement getDragAndDropPage;

    @FindBy(id = "column-a")
    private WebElement boxA;

    @FindBy(id = "column-b")
    private WebElement boxB;

    @FindBy(xpath = "//header[text()='A']")
    private WebElement headerA;

    @FindBy(xpath = "//header[text()='B']")
    private WebElement headerB;


    public void validationDragAndDropPage() {

        dragAndDropLink.click();
        //waitUntilVisibleOfElement(getDragAndDropPage);
        Assert.assertTrue(getDragAndDropPage.isDisplayed());
        Assert.assertTrue(getDragAndDropPage.getText().toLowerCase().contains("Drag".toLowerCase()));

    }

    public void userDragAndDropBoxAAndB() throws AWTException {

        Actions actions = new Actions(driver);
        Action action = actions.dragAndDrop(boxA,boxB).release(boxB).build();
        action.perform();
        //   actions.dragAndDrop(boxA,boxB).release(boxB).build().perform();
        //actions.dragAndDrop(boxA, boxB).build().perform();
        //  Robot robot = new Robot ();
//        robot.mouseMove(350, 226);
//        robot.keyPress(InputEvent.BUTTON1_MASK);
//        robot.mouseMove(250, 350);
//        robot.keyRelease(InputEvent.BUTTON1_MASK);

//        robot.mousePress(InputEvent.BUTTON1_MASK);
//        robot.mouseMove(20,50);
//        robot.mouseRelease(InputEvent.BUTTON1_MASK);

    }

    public void successfullySwitchedBoxAAndB(){
        waitUntilVisibleOfElement(headerA);
        waitUntilVisibleOfElement(headerB);
        Assert.assertEquals(headerA.getText(),boxB.getText());
        Assert.assertEquals(headerB.getText(),boxA.getText());

    }

}
