package StepDefinitions;

import POM.DragAndDropPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class DragAndDropSteps {

    DragAndDropPageElements dragAndDropPageElements;

    @Given("User navigate to drag and drop page")
    public void userNavigateToDragAndDropPage() {
        dragAndDropPageElements = new DragAndDropPageElements();
        dragAndDropPageElements.validationDragAndDropPage();
    }

    @When("User able to drag and drop box A to B")
    public void userAbleToDragAndDropBoxAToB() throws AWTException {
        dragAndDropPageElements = new DragAndDropPageElements();
        dragAndDropPageElements.userDragAndDropBoxAAndB();
    }

    @Then("User successfully switched the box A and B")
    public void userSuccessfullySwitchedTheBoxAAndB() {
        dragAndDropPageElements = new DragAndDropPageElements();
        dragAndDropPageElements.successfullySwitchedBoxAAndB();
    }
}
