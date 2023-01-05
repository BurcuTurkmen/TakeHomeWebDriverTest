package StepDefinitions;

import POM.MouseHoverPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MouseHoverSteps {

    MouseHoverPageElements mouseHoverPageElements;

    @Given("User navigate to mouse hover page")
    public void userNavigateToMouseHoverPage() {
        mouseHoverPageElements = new MouseHoverPageElements();
        mouseHoverPageElements.validationMouseHover();

    }

    @When("User does a mouse hover on first image")
    public void userDoesAMouseHoverOnFirstImage() {
        mouseHoverPageElements = new MouseHoverPageElements();
        mouseHoverPageElements.mouseHoverOnTheFirstImage();
    }

    @Then("Additional information should be displayed for first image")
    public void additionalInformationShouldBeDisplayedForFirstImage() {
        mouseHoverPageElements = new MouseHoverPageElements();
        mouseHoverPageElements.validateAdditionalInfoForFirstImage();
    }

    @And("User does a mouse hover on second image")
    public void userDoesAMouseHoverOnSecondImage() {
        mouseHoverPageElements = new MouseHoverPageElements();
        mouseHoverPageElements.mouseHoverOnTheSecondImage();
    }

    @Then("Additional information should be displayed for second image")
    public void additionalInformationShouldBeDisplayedForSecondImage() {
        mouseHoverPageElements = new MouseHoverPageElements();
        mouseHoverPageElements.validateAdditionalInfoForSecondImage();
    }

    @And("User does a mouse hover on third image")
    public void userDoesAMouseHoverOnThirdImage() {
        mouseHoverPageElements = new MouseHoverPageElements();
        mouseHoverPageElements.mouseHoverOnTheThirdImage();
    }

    @Then("Additional information should be displayed for third image")
    public void additionalInformationShouldBeDisplayedForThirdImage() {
        mouseHoverPageElements = new MouseHoverPageElements();
        mouseHoverPageElements.validateAdditionalInfoForThirdImage();
    }
}
