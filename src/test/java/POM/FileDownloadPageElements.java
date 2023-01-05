package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FileDownloadPageElements extends BasePOM {

    public FileDownloadPageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='File Download']")
    private WebElement fileDownloadBtn;

    @FindBy(xpath = "//h3[text()='File Downloader']")
    private WebElement fileDownloadPage;

    @FindBy(xpath = "//a[text()='some-file.txt']")
    private WebElement fileButton;

    @FindBy(linkText = "some-file.txt")
    private WebElement fileName;


    public void validationFileDownloaderPage(){
        fileDownloadBtn.click();
        waitUntilVisibleOfElement(fileDownloadPage);

        Assert.assertTrue(fileDownloadPage.isDisplayed());
        Assert.assertTrue(fileDownloadPage.getText().toLowerCase().contains("File".toLowerCase()));
    }

    public void userClickOnTheFile(){
        fileButton.click();
    }

    public void VerifyExpectedFileName() {
        File f = new File("C:\\Users\\burcu\\Downloads\\some-file.txt");
        // this will print true or false whether the file program.txt exists
        System.out.println("isFileDownloaded =" + f.exists());
        Assert.assertEquals(fileName.getText(), f.getName());
    }

}
