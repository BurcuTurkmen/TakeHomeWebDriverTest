package StepDefinitions;

import POM.DynamicLoadingPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicLoadingSteps {

    DynamicLoadingPageElements dynamicLoadingPageElements;
    @Given("User Navigate to Dynamic Loading page")
    public void userNavigateToDynamicLoadingPage() {
        dynamicLoadingPageElements = new DynamicLoadingPageElements();
        dynamicLoadingPageElements.validationDynamicLoadingPage();
    }

    @When("User able to click the exampleOne")
    public void userAbleToClickTheExampleOne() {
        dynamicLoadingPageElements = new DynamicLoadingPageElements();
        dynamicLoadingPageElements.userClickExample1();
    }

    @Then("User verify the Element on page that is hidden page is loaded")
    public void userVerifyTheElementOnPageThatIsHiddenPageIsLoaded() {
        dynamicLoadingPageElements = new DynamicLoadingPageElements();
        dynamicLoadingPageElements.verifyTheExample1OnThePage();
    }

    @And("User able to click start button")
    public void userAbleToClickStartButton() {
        dynamicLoadingPageElements = new DynamicLoadingPageElements();
        dynamicLoadingPageElements.userClickStartButton();
    }

    @Then("User successfully get the message")
    public void userSuccessfullyGetTheMessage() {
        dynamicLoadingPageElements = new DynamicLoadingPageElements();
        dynamicLoadingPageElements.successfullyGetTheMessage();
    }

    @When("User able to click the exampleTwo")
    public void userAbleToClickTheExampleTwo() {
        dynamicLoadingPageElements = new DynamicLoadingPageElements();
        dynamicLoadingPageElements.userClickExample2();
    }

    @Then("User verify the Element rendered after the fact page is loaded")
    public void userVerifyTheElementRenderedAfterTheFactPageIsLoaded() {
        dynamicLoadingPageElements = new DynamicLoadingPageElements();
        dynamicLoadingPageElements.verifyTheExample2OnThePage();
    }

}
