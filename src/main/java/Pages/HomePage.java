package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class HomePage extends BasePage {
    public HomePage() throws MalformedURLException {
    }

    @FindBy(xpath = "//android.widget.ImageButton[@index='0']")
    private WebElement settingsIcon;

    @FindBy(xpath = "//android.widget.Button[@index='4']")
    private WebElement newInjuryIcon;

    public void clickOnSettingsIcon()
    {
        settingsIcon.click();
    }

    public void clickOnNewInjuryIcon()
    {
        newInjuryIcon.click();
    }


}
