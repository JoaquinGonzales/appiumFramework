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
    private StartPage startPage = new StartPage();
    private LoginPage loginPage = new LoginPage();
    private SettingsPage settingsPage = new SettingsPage();
    private HomePage homePage = new HomePage();

    public LoginStepDefinition() throws MalformedURLException {
    }

    @Given("^I navigate to login page$")
    public void i_navigate_to_login_page(){
        startPage.clickLoginLink();
    }

    @When("^I enter \"([^\"]*)\" as user and \"([^\"]*)\" as password$")
    public void iEnterAsUserAndAsPassword(String userName, String password)  {
        loginPage.filloutFields(userName, password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }


    @Then("^I should see the email \"([^\"]*)\" in the user email field on the Osha reporting mobile application$")
    public void iShouldSeeTheEmailInTheUserEmailFieldOnTheOshaReportingMobileApplication(String emailAddress) {
        homePage.clickOnSettingsIcon();
        String expectedResult = settingsPage.returnEmailUserLogged();
        Assert.assertEquals(emailAddress, expectedResult);
    }
}
