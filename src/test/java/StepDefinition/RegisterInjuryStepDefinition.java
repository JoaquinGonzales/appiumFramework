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

    @And("^I Select Employee Type$")
    public void iSelectEmployeeType(){
        registerInjuryPage.selectIAm();
    }

    @And("^I introduce \"([^\"]*)\" as compliant name$")
    public void iIntroduceAsCompliantName(String compliantName) throws MalformedURLException {
        registerInjuryPage.fillOutCompliantName(compliantName);
    }

    @And("^I introduce \"([^\"]*)\" as compliant address$")
    public void iIntroduceAsCompliantAddress(String compliantAddress) throws MalformedURLException {
        registerInjuryPage.fillOutCompliantAddress(compliantAddress);
    }

    @And("^I introduce \"([^\"]*)\" as compliant phone$")
    public void iIntroduceAsCompliantPhone(String compliantPhone) throws MalformedURLException{
        registerInjuryPage.fillOutCompliantPhone(compliantPhone);
    }

    @And("^I introduce \"([^\"]*)\" as compliant Email$")
    public void iIntroduceAsCompliantEmail(String compliantEmail) throws MalformedURLException {
        registerInjuryPage.fillOutCompliantEmail(compliantEmail);
    }

    @And("^I introduce \"([^\"]*)\" as case number$")
    public void iIntroduceAsCaseNumber(String caseNumber) {
        registerInjuryPage.fillOutCaseNumber(caseNumber);
    }

    @And("^I enter \"([^\"]*)\" as employee name$")
    public void iEnterAsEmployeeName(String employeeName) throws MalformedURLException {
        registerInjuryPage.fillOutEmployeesName(employeeName);
    }

    @And("^I enter \"([^\"]*)\" as Job tittle$")
    public void iEnterAsJobTittle(String jobTittle) {
        registerInjuryPage.fillOutJobTittle(jobTittle);
    }

    @And("^I Select Today as Date Injury$")
    public void iSelectTodayAsDateInjury() throws MalformedURLException {
        registerInjuryPage.clickOnCalendar();
    }

    @And("^I enter \"([^\"]*)\" as where event occurs$")
    public void iEnterAsWhereEventOccurs(String workPlaceName) {
        registerInjuryPage.fillOutWorkPlace(workPlaceName);
    }

    @And("^I enter \"([^\"]*)\" as decription$")
    public void iEnterAsDecription(String description) {
        registerInjuryPage.fillOutDetail(description);
    }

    @And("^I select Days away from work as Variant$")
    public void iSelectDaysAwayFromWorkAsVariant() {
        registerInjuryPage.selectVariant();
    }

    @And("^I enter \"([^\"]*)\" away from work option$")
    public void iEnterAwayFromWorkOption(String awayFromOption) {
        registerInjuryPage.awayFromWork(awayFromOption);
    }

    @And("^I select job Transfer restriction$")
    public void iSelectJobTransferRestriction(){
      registerInjuryPage.selectCondition();
    }

    @And("^I set a report today date$")
    public void iSetAReportTodayDate(){
        registerInjuryPage.selectDate();
    }

    @And("^I click on save and send button$")
    public void iClickOnSaveAndSendButton() throws MalformedURLException {
       registerInjuryPage.clickOnSaveAndSend();
    }
}
