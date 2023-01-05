package StepDefinitions;

import POM.DropdownPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropdownSteps {

    DropdownPageElements dropdownPageElements;

    @Given("User Navigate to Dropdown page")
    public void userNavigateToDropdownPage() {
        dropdownPageElements = new DropdownPageElements();
        dropdownPageElements.validateDropdownPage();

    }

    @When("User able to click on the dropdown button")
    public void userAbleToClickOnTheDropdownButton() {
        dropdownPageElements = new DropdownPageElements();
        dropdownPageElements.validateDropdownPage();

    }

    @Then("User able to select the option1")
    public void userAbleToSelectTheOption1() {
        dropdownPageElements = new DropdownPageElements();
        dropdownPageElements.userSelectTheOption1();


    }

    @Then("User successfully selected the option1")
    public void userSuccessfullySelectedTheOption1() {
        dropdownPageElements = new DropdownPageElements();
        dropdownPageElements.verifyTheOption1IsSelected();

    }


    @Then("User able to select the option2")
    public void userAbleToSelectTheOption2() {
        dropdownPageElements = new DropdownPageElements();
        dropdownPageElements.userSelectTheOption2();

    }

    @Then("User successfully selected the option2")
    public void userSuccessfullySelectedTheOption2() {
        dropdownPageElements = new DropdownPageElements();
        dropdownPageElements.verifyTheOption2IsSelected();
    }

}
