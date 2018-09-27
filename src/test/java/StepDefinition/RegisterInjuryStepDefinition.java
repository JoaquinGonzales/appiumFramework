package StepDefinition;

import Pages.RegisterInjuryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import java.net.MalformedURLException;

public class RegisterInjuryStepDefinition {
    private RegisterInjuryPage registerInjuryPage = new RegisterInjuryPage();

    public RegisterInjuryStepDefinition() throws MalformedURLException {
    }

    @And("^I select Type of Business$")
    public void iSelectTypeOfBusiness() {
        registerInjuryPage.selectTypeOfBusiness();
    }

    @And("^I introduce \"([^\"]*)\" as Established Name$")
    public void iIntroduceAsEstablishedName(String establishedName) {
        registerInjuryPage.fillOutEstablishmentName(establishedName);
    }

    @And("^I introduce \"([^\"]*)\" as Address$")
    public void iIntroduceAsAddress(String address) {
       registerInjuryPage.fillAddress(address);
    }

    @And("^I introduce \"([^\"]*)\" as SiteAddress$")
    public void introduceAsSiteAddress(String siteAddress) {
        registerInjuryPage.fillOutSiteAddress(siteAddress);
    }

    @And("^I introduce \"([^\"]*)\" as mailing address$")
    public void iIntroduceAsMailingAddress(String mailinigAddress)  {
        registerInjuryPage.fillOutMailingAddress(mailinigAddress);
    }

    @And("^I introduce \"([^\"]*)\" as phone$")
    public void iIntroduceAsPhone(String phone) throws MalformedURLException {
        registerInjuryPage.fillOutPhone(phone);
    }

    @And("^I introduce \"([^\"]*)\" as Management Official$")
    public void iIntroduceAsManagementOfficial(String managementOfficial) throws MalformedURLException {
        registerInjuryPage.fillOutManagementOfficial(managementOfficial);
    }

    @And("^I move it to next page$")
    public void iMoveItToNextPage() throws MalformedURLException {
        registerInjuryPage.moveToNextPage();
    }
}
