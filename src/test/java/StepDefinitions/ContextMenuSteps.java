package StepDefinitions;

import POM.ContextMenuPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContextMenuSteps {

    ContextMenuPageElements contextMenuPageElements;

    @Given("User Navigate to Context Menu page")
    public void userNavigateToContextMenuPage() {
        contextMenuPageElements = new ContextMenuPageElements();
        contextMenuPageElements.validateContextMenuPage();
    }

    @When("User able to right click in the box")
    public void userAbleToRightClickInTheBox() {
        contextMenuPageElements = new ContextMenuPageElements();
        contextMenuPageElements.userRightClickInTheBox();

    }

    @Then("User able to handle the JavaScript alert and verify successfully")
    public void userAbleToHandleTheJavaScriptAlertAndVerifySuccessfully() {
        contextMenuPageElements = new ContextMenuPageElements();
        contextMenuPageElements.userHandleTheJavaScriptAlert();

    }
}
