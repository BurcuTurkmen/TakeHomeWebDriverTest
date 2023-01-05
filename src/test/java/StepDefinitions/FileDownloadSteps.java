package StepDefinitions;

import POM.FileDownloadPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileDownloadSteps {

    FileDownloadPageElements fileDownloadPageElements;

    @Given("User Navigate to File Download page")
    public void userNavigateToFileDownloadPage() {
        fileDownloadPageElements = new FileDownloadPageElements();
        fileDownloadPageElements.validationFileDownloaderPage();

    }

    @When("User able to click on the file")
    public void userAbleToClickOnTheFile() {
        fileDownloadPageElements = new FileDownloadPageElements();
        fileDownloadPageElements.userClickOnTheFile();
    }

    @Then("User successfully downloaded the file")
    public void userSuccessfullyDownloadedTheFile() {
        fileDownloadPageElements = new FileDownloadPageElements();
        fileDownloadPageElements.VerifyExpectedFileName();
    }

}
