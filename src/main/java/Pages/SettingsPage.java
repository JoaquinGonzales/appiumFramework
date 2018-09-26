package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class SettingsPage extends BasePage {

    @FindBy(id = "com.snappii_corp.osha_case_reporting:id/user_email")
    private WebElement userEmail;

    public SettingsPage() throws MalformedURLException {
    }

    public String returnEmailUserLogged()
    {
        return userEmail.getText();
    }

}
