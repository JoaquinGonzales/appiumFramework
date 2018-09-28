package Pages;

import Components.CommonEvents;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.MalformedURLException;
import java.util.Date;

public class RegisterInjuryPage extends BasePage {

    private String phoneToLocator = "Phone";
    private String ManagementOfficialeToLocator = "Management Official";
    private Date date = new Date();


    @FindBy(xpath = "//android.widget.EditText[@text='Type of Business']")
    private WebElement typeOfBussinesTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Establishment Name']")
    private WebElement establishedNameTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Site Address']")
    private WebElement siteAddressTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Mailing Address']")
    private WebElement mailiningAddressTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Address']")
    private WebElement addressTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Select type']")
    private WebElement iAmTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Case Number']")
    private WebElement caseNumberTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Job title']")
    private WebElement jobTittleTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Date of Injury']")
    private WebElement dateInjuryTextField;

    @FindBy(id = "android:id/button1")
    private WebElement doneButton;

    @FindBy(xpath = "//android.widget.EditText[@text='Select variant']")
    private WebElement selectVariantField;

    @FindBy(xpath = "//android.widget.EditText[@text='Away from work']")
    private WebElement awayTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Select condition']")
    private WebElement selectConditionTextField;

    @FindBy(xpath = "//android.widget.EditText[@text='Date']")
    private WebElement dateTextfield;

    @FindBy(xpath = "//android.widget.Button[@text='Save and Send']")
    private WebElement saveButton;

    /*@FindBy(how = How.XPATH, using = "//android.widget.EditText[contains(.,'name')]")
    private WebElement compliantNameElement;*/

    //@FindBy(how=How.XPATH,using=("//android.widget.TextView55[contains(.,‘Family Profile’)]"))

    public RegisterInjuryPage() throws MalformedURLException {
    }

    public void selectTypeOfBusiness() {
        typeOfBussinesTextField.click();
        androidDriver.findElementById("android:id/text1").click();
        androidDriver.findElementById("android:id/button1").click();
    }

    public void fillOutEstablishmentName(String establishmentName) {
        establishedNameTextField.sendKeys(establishmentName);
        androidDriver.navigate().back();
    }

    public void fillOutSiteAddress(String siteAddress) {
        siteAddressTextField.sendKeys(siteAddress);
        androidDriver.navigate().back();
    }

    public void fillOutMailingAddress(String mailingAddress) {
        mailiningAddressTextField.sendKeys(mailingAddress);
        androidDriver.navigate().back();
    }

    public void fillAddress(String address) {
        addressTextField.sendKeys(address);
        androidDriver.navigate().back();
    }

    public void fillOutPhone(String phone) throws MalformedURLException {
        WebElement phoneElement = CommonEvents.scrollDownUntilEditableElement(phoneToLocator);
        phoneElement.sendKeys(phone);
        androidDriver.navigate().back();
    }

    public void fillOutManagementOfficial(String managementOfficial) throws MalformedURLException {
        WebElement managementOfficialelement = CommonEvents.scrollDownUntilEditableElement(ManagementOfficialeToLocator);
        managementOfficialelement.sendKeys(managementOfficial);
        androidDriver.navigate().back();
    }

    public void moveToNextPage() throws MalformedURLException {
        CommonEvents.swipeAction();
    }

    public void selectIAm() {
        iAmTextField.click();
        androidDriver.findElementById("android:id/text1").click();
        androidDriver.findElementById("android:id/button1").click();
    }

    public void fillOutCompliantName(String compliantName) throws MalformedURLException {
        WebElement compliantNameElement = CommonEvents.findByContainsText("name");
        compliantNameElement.sendKeys(compliantName);
    }

    public void fillOutCompliantAddress(String compliantAddress) throws MalformedURLException {
        WebElement compliantAddressElement = CommonEvents.findByContainsText("Address");
        compliantAddressElement.sendKeys(compliantAddress);
    }

    public void fillOutCompliantPhone(String compliantPhone) throws MalformedURLException {
        WebElement compliantAddressElement = CommonEvents.findByContainsText("Phone");
        compliantAddressElement.sendKeys(compliantPhone);
        androidDriver.navigate().back();
    }

    public void fillOutCompliantEmail(String compliantEmail) throws MalformedURLException {
        WebElement compliantAddressElement = CommonEvents.findByContainsText("Email");
        compliantAddressElement.sendKeys(compliantEmail);
    }

    public void fillOutCaseNumber(String caseNumber) {
        caseNumberTextField.sendKeys(caseNumber);
        androidDriver.navigate().back();
    }

    public void fillOutEmployeesName(String employeeName) throws MalformedURLException {
        WebElement employeeNameelement = CommonEvents.findByContainsText("Employee");
        employeeNameelement.sendKeys(employeeName);
    }

    public void fillOutJobTittle(String jobTittle) {
        jobTittleTextField.sendKeys(jobTittle);
        androidDriver.navigate().back();
    }

    public void clickOnCalendar() throws MalformedURLException {
//        String actualDate = CommonEvents.getActualDate();
//        WebElement calendar = CommonEvents.findByContainsText(actualDate);
//        calendar.click();
        dateInjuryTextField.click();
        doneButton.click();
    }

    //driver.findElementByXPath("//android.view.View[
    // @content-desc='Password']/following-sibling::android.view.View/android.widget.EditText").sendKeys("Your_Password");
    public void fillOutWorkPlace(String workplace) {
        WebElement workPlaceElement = androidDriver.findElementByXPath("//android.widget.TextView[@text='Where the event occurred:']/following-sibling::android.widget.LinearLayout/child::android.widget.LinearLayout/child::android.widget.EditText");
        workPlaceElement.sendKeys(workplace);
        androidDriver.navigate().back();
    }

    public void fillOutDetail(String detail) {
        String detailText = "Describe injury or illness, parts of body affected, and object/substance that directly injured or made person ill.";
        WebElement detailElemnent = androidDriver.findElementByXPath("//android.widget.TextView[@text='" + detailText + "']/following-sibling::android.widget.LinearLayout/child::android.widget.LinearLayout/child::android.widget.EditText");
        detailElemnent.sendKeys(detail);
        androidDriver.navigate().back();
    }

    public void selectVariant() {
        selectVariantField.click();
        androidDriver.findElementById("android:id/text1").click();
        androidDriver.findElementById("android:id/button1").click();
    }

    public void awayFromWork(String awayFromWork) {
        awayTextField.sendKeys(awayFromWork);
        androidDriver.navigate().back();
    }

    public void selectCondition() {
        selectConditionTextField.click();
        androidDriver.findElementById("android:id/text1").click();
        androidDriver.findElementById("android:id/button1").click();
    }

    public void selectDate() {
        dateTextfield.click();
        doneButton.click();
    }

    public void clickOnSaveAndSend() throws MalformedURLException {
        WebElement saveAndSendButton = CommonEvents.scrolldownUntillButtonIsVisible("Save and Send");
        saveAndSendButton.click();
    }
}
