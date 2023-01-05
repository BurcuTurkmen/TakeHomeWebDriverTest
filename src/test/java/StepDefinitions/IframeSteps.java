package StepDefinitions;

import POM.IframePageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IframeSteps {

    IframePageElements iframePageElements;

    @Given("Users navigate to the iframe page")
    public void usersNavigateToTheIframePage() {
        iframePageElements = new IframePageElements();
        iframePageElements.validateIframePage();

    }

    @When("User switch to iframe and type a text")
    public void userSwitchToIframeAndTypeAText() {
        iframePageElements = new IframePageElements();
        iframePageElements.userTypeIntoIframe();

    }

    @Then("The text should be displayed in the iframe")
    public void theTextShouldBeDisplayedInTheIframe() {
        iframePageElements = new IframePageElements();
        iframePageElements.validateTextInIframe();
    }
}
