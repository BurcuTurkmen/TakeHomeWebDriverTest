package StepDefinitions;

import POM.LoginPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPageElements loginPageElements;


    @Given("User navigates to login page")
    public void userNavigatesToLoginPage() {
        loginPageElements = new LoginPageElements();
        loginPageElements.validationLoginPage();

    }

    @When("User enters valid credentials with valid username {string} and valid password {string}")
    public void userEntersValidCredentialsWithValidUsernameAndValidPassword(String username, String password) {
        loginPageElements = new LoginPageElements();
        loginPageElements.loginWithValidCredentials(username, password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPageElements = new LoginPageElements();
        loginPageElements.userClickOnLoginButton();

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        loginPageElements = new LoginPageElements();
        loginPageElements.validationSuccessMessage();
    }

    @When("User enters invalid credentials with invalid username {string} and invalid password {string}")
    public void userEntersInvalidCredentialsWithInvalidUsernameAndInvalidPassword(String invalidUsername, String invalidPassword) {
        loginPageElements = new LoginPageElements();
        loginPageElements.loginWithInvalidCredentials(invalidUsername, invalidPassword);
    }

    @Then("User should not be able to login successfully")
    public void userShouldNotBeAbleToLoginSuccessfully() {
        loginPageElements = new LoginPageElements();
        loginPageElements.validationUnsuccessfulMessage();
    }
}
