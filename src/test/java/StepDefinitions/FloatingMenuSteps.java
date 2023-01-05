package StepDefinitions;

import POM.FloatingMenuPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FloatingMenuSteps {

    FloatingMenuPageElements floatingMenuPageElements;
    @Given("User Navigate to Floating Menu page")
    public void userNavigateToFloatingMenuPage() {
        floatingMenuPageElements = new FloatingMenuPageElements();
        floatingMenuPageElements.validationFloatingMenuPage();

    }

    @When("User able to scroll the page")
    public void userAbleToScrollThePage() {
        floatingMenuPageElements = new FloatingMenuPageElements();
        floatingMenuPageElements.scrollThePage();
    }

    @Then("Verify the floating menu is still displayed")
    public void verifyTheFloatingMenuIsStillDisplayed() {
        floatingMenuPageElements = new FloatingMenuPageElements();
        floatingMenuPageElements.verifyTheFloatingMenuIsStillDisplayed();
    }

}
