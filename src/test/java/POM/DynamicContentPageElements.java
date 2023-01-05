package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicContentPageElements extends BasePOM {

    public DynamicContentPageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Dynamic Content']")
    private WebElement dynamicContentBtn;

    @FindBy(xpath = "//h3[text()='Dynamic Content']")
    private WebElement dynamicContentPage;

    @FindBy(xpath = "//a[text()='click here']")
    private WebElement clickHereLink;

    @FindBy(xpath = "(//div[@class='large-10 columns'])[3]")
    private WebElement textMessages;



    public void validationDynamicContentPage(){
        dynamicContentBtn.click();
        waitUntilVisibleOfElement(dynamicContentPage);
        Assert.assertTrue(dynamicContentPage.isDisplayed());
        Assert.assertTrue(dynamicContentPage.getText().toLowerCase().contains("Dynamic".toLowerCase()));
    }

    public void userClickTheClickHereLinkMultipleTimes(){
//        driver.get("http://localhost:7080/dynamic_content");
//        driver.navigate().refresh();
        clickHereLink.click();

    }

    public void userRefreshedTheFirstPageSuccessfully(){
        String expectedResult = "\n" +
                "            Nulla aut reprehenderit dignissimos a et laboriosam perspiciatis eum tempora consequatur perferendis porro veniam quia illum neque at ut adipisci placeat maxime assumenda ut veritatis et facere corrupti debitis ab.\n" +
                "          ";

        Assert.assertTrue(textMessages.isDisplayed());
        org.testng.Assert.assertNotEquals(expectedResult,textMessages.getText());


    }

    public void userRefreshedTheSecondPageSuccessfully(){
        String expectedResult = "\n" +
                "            Voluptas aut blanditiis quas quos eius architecto est debitis voluptas beatae et dolore suscipit dolorum laborum voluptatem nulla possimus et sit est id rem magnam enim ullam totam adipisci rerum.\n" +
                "          ";
        Assert.assertTrue(textMessages.isDisplayed());
        org.testng.Assert.assertNotEquals(expectedResult,textMessages.getText());
    }

    public void userRefreshedTheThirdPageSuccessfully(){
        String expectedResult = "\n" +
                "            Id et odit explicabo quis vero molestiae hic illum qui et culpa dignissimos doloremque praesentium eveniet quas nihil non enim ad animi ut iusto similique ipsam aut itaque natus est cumque.\n" +
                "          ";
        Assert.assertTrue(textMessages.isDisplayed());
        org.testng.Assert.assertNotEquals(expectedResult,textMessages.getText());
    }

}
