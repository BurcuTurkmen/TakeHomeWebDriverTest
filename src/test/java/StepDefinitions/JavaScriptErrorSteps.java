package StepDefinitions;

import POM.JavaScriptErrorPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JavaScriptErrorSteps {

    JavaScriptErrorPageElements javaScriptErrorPageElements;


    @Given("User navigate to homepage")
    public void userNavigateToHomepage() {
        javaScriptErrorPageElements = new JavaScriptErrorPageElements();
        javaScriptErrorPageElements.navigateToHomePage();
    }
    @When("User clicks to the JavaScript Error link")
    public void userClicksToTheJavaScriptErrorLink() {
        javaScriptErrorPageElements = new JavaScriptErrorPageElements();
        javaScriptErrorPageElements.userClickOnTheJavaScriptErrorLink();
    }
    @Then("User navigate to JavaScript Error page")
    public void userNavigateToJavaScriptErrorPage() {
        javaScriptErrorPageElements = new JavaScriptErrorPageElements();
        javaScriptErrorPageElements.validateJavaScriptErrorPage();

    }

    @Then("Used should see the error message")
    public void usedShouldSeeTheErrorMessage() {
        javaScriptErrorPageElements = new JavaScriptErrorPageElements();
        javaScriptErrorPageElements.validateErrorMessage();

    }
}
