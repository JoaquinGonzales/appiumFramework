package StepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SettingsPage;
import Pages.StartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.net.MalformedURLException;

public class LoginStepDefinition {

    private LoginPage loginPage = new LoginPage();


    public LoginStepDefinition() throws MalformedURLException {
    }


    @When("^I enter \"([^\"]*)\" as user and \"([^\"]*)\" as password$")
    public void iEnterAsUserAndAsPassword(String userName, String password)  {
        loginPage.filloutFields(userName, password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }


    @And("^I am logged in on Osha app with the following username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iAmLoggedInOnOshaAppWithTheFollowingUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
        loginPage.clickLoginButton();
    }
}
