package StepDefinition;

import Pages.SettingsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.net.MalformedURLException;

public class SettingsStepDefinition {

    private SettingsPage settingsPage = new SettingsPage();

    public SettingsStepDefinition() throws MalformedURLException {
    }

    @Then("^I should see the email \"([^\"]*)\" in the user email field on the Osha reporting mobile application$")
    public void iShouldSeeTheEmailInTheUserEmailFieldOnTheOshaReportingMobileApplication(String emailAddress) {
        String expectedResult = settingsPage.returnEmailUserLogged();
        Assert.assertEquals(emailAddress, expectedResult);
    }

    @And("^I click on log out button$")
    public void iClickOnLogOutButton() {
        settingsPage.swipeDown();
        settingsPage.clickOnLogOutButton();
    }
}
