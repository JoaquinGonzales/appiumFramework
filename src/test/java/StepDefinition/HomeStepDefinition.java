package StepDefinition;

import Pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.net.MalformedURLException;

public class HomeStepDefinition {
    private HomePage homePage = new HomePage();

    public HomeStepDefinition() throws MalformedURLException {
    }


    @And("^I Click on Settings icon$")
    public void i_Click_on_Settings_icon() {
       homePage.clickOnSettingsIcon();
    }

    @When("^I Click on New Injury icon$")
    public void iClickOnNewInjuryIcon() {
        homePage.clickOnNewInjuryIcon();
    }
}
