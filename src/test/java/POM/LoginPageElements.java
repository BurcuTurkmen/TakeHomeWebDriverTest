package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements extends BasePOM {

    public LoginPageElements(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[text()='Login Page']")
    private WebElement loginPageText;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement loginLink;

    @FindBy(id = "flash-messages")
    private WebElement successMessageText;

    @FindBy(id = "flash")
    private WebElement unsuccessfulMessageText;

    public void validationLoginPage(){
        driver.get("http://localhost:7080/login");
                waitUntilVisibleOfElement(loginPageText);
        Assert.assertTrue(loginPageText.isDisplayed());
    }

    public void loginWithValidCredentials(String username, String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);

    }

    public void userClickOnLoginButton(){

        loginLink.click();
    }

    public void validationSuccessMessage(){

        waitUntilVisibleOfElement(successMessageText);

        Assert.assertTrue(successMessageText.isDisplayed());
        Assert.assertTrue(successMessageText.getText().contains("logged".toLowerCase()));

    }

    public void loginWithInvalidCredentials(String invalidUsername,String invalidPassword){

        usernameInput.sendKeys(invalidUsername);
        passwordInput.sendKeys(invalidPassword);
    }

    public void validationUnsuccessfulMessage() {
        waitUntilVisibleOfElement(unsuccessfulMessageText);

        Assert.assertTrue(unsuccessfulMessageText.isDisplayed());
        Assert.assertTrue(unsuccessfulMessageText.getText().contains("invalid".toLowerCase()));
    }

}
