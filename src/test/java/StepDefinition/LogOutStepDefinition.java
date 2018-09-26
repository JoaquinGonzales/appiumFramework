package StepDefinition;

import Pages.LogOutPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import java.net.MalformedURLException;

public class LogOutStepDefinition {
    private LogOutPage logOutPage = new LogOutPage();

    public LogOutStepDefinition() throws MalformedURLException {
    }

    @And("^I confirm the Log out$")
    public void iConfirmTheLogOut() {
        logOutPage.clickOnLogOutConfirmationButton();
    }
}
