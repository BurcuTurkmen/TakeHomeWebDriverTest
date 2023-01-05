package StepDefinitions;

import POM.JavaScriptAlertPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JavaScriptAlertsSteps {

    JavaScriptAlertPageElements javaScriptAlertPageElements;

    @Given("User navigates to JavaScript Alerts page")
    public void userNavigatesToJavaScriptAlertsPage() {
        javaScriptAlertPageElements = new JavaScriptAlertPageElements();
        javaScriptAlertPageElements.validationJavaScriptAlertPage();
    }

    @When("User clicks on JS Alert button")
    public void userClicksOnJSAlertButton() {
        javaScriptAlertPageElements = new JavaScriptAlertPageElements();
        javaScriptAlertPageElements.userClickTheJSAlertButton();
    }

    @Then("Alert message should be displayed")
    public void alertMessageShouldBeDisplayed() {
        javaScriptAlertPageElements = new JavaScriptAlertPageElements();
        javaScriptAlertPageElements.userHandleTheJSAlert();

    }

    @And("User clicks on JS Confirm button")
    public void userClicksOnJSConfirmButton() {
        javaScriptAlertPageElements = new JavaScriptAlertPageElements();
        javaScriptAlertPageElements.userClickTheJSConfirmButton();
    }

    @Then("User clicks on JS Prompt button")
    public void userClicksOnJSPromptButton() {
        javaScriptAlertPageElements = new JavaScriptAlertPageElements();
        javaScriptAlertPageElements.userClickTheJSPromptButton();
    }
}
