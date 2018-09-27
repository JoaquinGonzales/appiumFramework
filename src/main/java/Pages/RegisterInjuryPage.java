package Pages;

import Components.CommonEvents;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class RegisterInjuryPage extends BasePage {

    private String phoneToLocator= "Phone";
    private String ManagementOfficialeToLocator= "Management Official";

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


    public RegisterInjuryPage() throws MalformedURLException {
    }

    public void selectTypeOfBusiness()
    {
        typeOfBussinesTextField.click();
        androidDriver.findElementById("android:id/text1").click();
        androidDriver.findElementById("android:id/button1").click();
    }

    public void fillOutEstablishmentName(String establishmentName)
    {
        establishedNameTextField.sendKeys(establishmentName);
        androidDriver.navigate().back();
    }

    public void fillOutSiteAddress(String siteAddress)
    {
        siteAddressTextField.sendKeys(siteAddress);
        androidDriver.navigate().back();
    }

    public void fillOutMailingAddress(String mailingAddress)
    {
        mailiningAddressTextField.sendKeys(mailingAddress);
        androidDriver.navigate().back();
    }

    public void fillAddress(String address)
    {
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
    }

    public void moveToNextPage() throws MalformedURLException {
        CommonEvents.swipeAction();
    }
}
