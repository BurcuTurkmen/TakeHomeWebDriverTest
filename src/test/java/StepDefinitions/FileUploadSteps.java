package StepDefinitions;

import POM.FileUploadPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class FileUploadSteps {

    FileUploadPageElements fileUploadPageElements;

    @Given("User Navigate to File Upload page")
    public void userNavigateToFileUploadPage() {
        fileUploadPageElements = new FileUploadPageElements();
        fileUploadPageElements.clickFileUploadButton();
    }

    @When("User able to click on the File Upload button")
    public void userAbleToClickOnTheFileUploadButton() {
        fileUploadPageElements = new FileUploadPageElements();
        fileUploadPageElements.validationFileUploaderPage();
    }

    @And("User able to select the file from already downloaded file")
    public void userAbleToSelectTheFileFromAlreadyDownloadedFile() throws AWTException {
        fileUploadPageElements = new FileUploadPageElements();
        fileUploadPageElements.userSelectFile();
    }

    @And("User able to click on the upload button")
    public void userAbleToClickOnTheUploadButton() {
        fileUploadPageElements = new FileUploadPageElements();
        fileUploadPageElements.userClickOnTheUploadButton();
    }

    @Then("User successfully uploaded the file")
    public void userSuccessfullyUploadedTheFile() {
        fileUploadPageElements = new FileUploadPageElements();
        fileUploadPageElements.fileSuccessfullyUploaded();
    }

    @And("User able to drag and drop the file in the box")
    public void userAbleToDragAndDropTheFileInTheBox() {
    }

}
