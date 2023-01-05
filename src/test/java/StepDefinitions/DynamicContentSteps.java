package StepDefinitions;

import POM.DynamicContentPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicContentSteps {

    DynamicContentPageElements dynamicContentPageElements;

    @Given("User Navigate to Dynamic Content page")
    public void userNavigateToDynamicContentPage() {
        dynamicContentPageElements = new DynamicContentPageElements();
        dynamicContentPageElements.validationDynamicContentPage();

    }

    @When("User able to click to refreshes the page")
    public void userAbleToClickRefreshesThePage() {
        dynamicContentPageElements = new DynamicContentPageElements();
        dynamicContentPageElements.userClickTheClickHereLinkMultipleTimes();
    }

    @Then("User should able to refreshed the first page successfully")
    public void userShouldAbleToRefreshedTheFirstPageSuccessfully() {
        dynamicContentPageElements = new DynamicContentPageElements();
        dynamicContentPageElements.userRefreshedTheFirstPageSuccessfully();
    }


    @Then("User should able to refreshed the second page successfully")
    public void userShouldAbleToRefreshedTheSecondPageSuccessfully() {
        dynamicContentPageElements = new DynamicContentPageElements();
        dynamicContentPageElements.userRefreshedTheSecondPageSuccessfully();
    }

    @Then("User should able to refreshed the third page successfully")
    public void userShouldAbleToRefreshedTheThirdPageSuccessfully() {
        dynamicContentPageElements = new DynamicContentPageElements();
        dynamicContentPageElements.userRefreshedTheThirdPageSuccessfully();
    }

}
