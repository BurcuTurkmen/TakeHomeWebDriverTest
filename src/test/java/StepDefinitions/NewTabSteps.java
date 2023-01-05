package StepDefinitions;

import POM.NewTabPageElements;
import POM.NotificationMessagePageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTabSteps {

    NewTabPageElements newTabPageElements;


    @Given("User navigate to new window page")
    public void userNavigateToNewWindowPage() {
        newTabPageElements = new NewTabPageElements();
        newTabPageElements.validateNewTabPage();

    }

    @When("User clicks on click here link")
    public void userClicksOnClickHereLink() {
        newTabPageElements = new NewTabPageElements();
        newTabPageElements.userClickOnTheLink();

    }

    @Then("New window message should be displayed in new tab")
    public void newWindowMessageShouldBeDisplayedInNewTab() {
        newTabPageElements = new NewTabPageElements();
        newTabPageElements.validateNewWindowMessage();

    }
}
