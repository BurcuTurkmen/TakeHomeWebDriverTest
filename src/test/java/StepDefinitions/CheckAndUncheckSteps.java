package StepDefinitions;

import POM.CheckAndUncheckPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckAndUncheckSteps {

    CheckAndUncheckPageElements checkAndUncheckPageElements;
    @Given("User Navigate to Checkboxes page")
    public void userNavigateToCheckboxesPage() {

        checkAndUncheckPageElements = new CheckAndUncheckPageElements();
        checkAndUncheckPageElements.validationCheckboxPage();
    }

    @When("User able to check the checkbox1")
    public void userAbleToCheckTheCheckbox1() {
        checkAndUncheckPageElements = new CheckAndUncheckPageElements();
        checkAndUncheckPageElements.UserCheckTheCheckbox1();
    }

    @Then("User successfully checked the checkbox1")
    public void userSuccessfullyCheckedTheCheckbox1() {
    }

    @And("User able to uncheck the checkbox2")
    public void userAbleToUncheckTheCheckbox2() {
        checkAndUncheckPageElements = new CheckAndUncheckPageElements();
        checkAndUncheckPageElements.UserUnCheckTheCheckbox2();
    }

    @Then("User successfully checked the checkbox2")
    public void userSuccessfullyCheckedTheCheckbox2() {
    }
}
