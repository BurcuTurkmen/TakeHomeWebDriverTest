package StepDefinitions;

import POM.NotificationMessagePageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotificationMessageSteps {

    NotificationMessagePageElements notificationMessagePageElements;

    @Given("User navigate to notification message page")
    public void userNavigateToNotificationMessagePage() {
        notificationMessagePageElements = new NotificationMessagePageElements();
        notificationMessagePageElements.validateNotificationMessagePage();
    }

    @When("User able to click on the click here link")
    public void userAbleToClickOnTheClickHereLink() {
        notificationMessagePageElements = new NotificationMessagePageElements();
        notificationMessagePageElements.userClickOnTheLink();
    }

    @Then("Unsuccessful message should be display")
    public void unsuccessfulMessageShouldBeDisplay() {
        notificationMessagePageElements = new NotificationMessagePageElements();
        notificationMessagePageElements.validateUnsuccessfulMessage();
    }

    @And("User able to double click on the click here link")
    public void userAbleToDoubleClickOnTheClickHereLink() {
        notificationMessagePageElements = new NotificationMessagePageElements();
        notificationMessagePageElements.userDoubleClickOnTheLink();
    }
    @Then("Success message should be display")
    public void successMessageShouldBeDisplay() {
        notificationMessagePageElements = new NotificationMessagePageElements();
        notificationMessagePageElements.validateSuccessMessage();
    }
}
