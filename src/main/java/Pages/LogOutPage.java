package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class LogOutPage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[@text='Logout']")
    private WebElement logOutConfirmationButton;

    public LogOutPage() throws MalformedURLException {
    }

    public void clickOnLogOutConfirmationButton()
    {
        logOutConfirmationButton.click();
    }
}
