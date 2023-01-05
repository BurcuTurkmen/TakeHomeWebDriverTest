package StepDefinitions;

import POM.DynamicControlsPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicControlsSteps {

    DynamicControlsPageElements dynamicControlsPageElements;
    @Given("User Navigate to Dynamic Controls page")
    public void userNavigateToDynamicControlsPage() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.validationDynamicControlsPage();

    }

    @When("User able to click the remove button")
    public void userAbleToClickTheRemoveButton() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userClickToRemoveButton();
    }

    @Then("User successfully removed the checkbox")
    public void userSuccessfullyRemovedTheCheckbox() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userSuccessfullyRemovedTheCheckbox();
    }

    @And("User able to click to add button")
    public void userAbleToClickToAddButton() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userClickTheAddButton();
    }

    @Then("User successfully added the checkbox back")
    public void userSuccessfullyAddedTheCheckboxBack() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userSuccessfullyAddedTheCheckbox();
    }

    @And("User able to click to enable button")
    public void userAbleToClickToEnableButton() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userClickTheEnableButton();
    }

    @Then("User successfully enabled is the box")
    public void userSuccessfullyEnabledIsTheBox() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userSuccessfullyEnabled();
    }

    @And("User able to click to disable button")
    public void userAbleToClickToDisableButton() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userClickTheDisableButton();
    }

    @Then("User successfully disabled is the box")
    public void userSuccessfullyDisabledISTheBox() {
        dynamicControlsPageElements = new DynamicControlsPageElements();
        dynamicControlsPageElements.userSuccessfullyDisabled();
    }
}
