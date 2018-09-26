package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class HomePage extends BasePage {
    public HomePage() throws MalformedURLException {
    }

    @FindBy(xpath = "//android.widget.ImageButton[@index='0']")
    private WebElement settingsIcon;

    public void clickOnSettingsIcon()
    {
        settingsIcon.click();
    }

}
