package StepDefinition;

import Pages.StartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.net.MalformedURLException;

public class StartStepDefinition {

    private StartPage startPage = new StartPage();
    private final String  welcome = "Welcome";

    public StartStepDefinition() throws MalformedURLException {
    }

    @Given("^I navigate to login page$")
    public void i_navigate_to_login_page(){
        startPage.clickLoginLink();
    }


    @Then("^I should be logged out from Osha App$")
    public void iShouldBeLoggedOutFromOshaApp()  {
        String actualResult = startPage.getWelcomeTitle();
        Assert.assertEquals(welcome, actualResult);
    }
}
