package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StartPage extends BasePage {

    public StartPage() throws MalformedURLException {
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Log in']")
    WebElement loginLink;

    @FindBy(xpath = "//android.widget.TextView[@text='Welcome']")
    private WebElement welcomeText;

    public void clickLoginLink()
    {
        loginLink.click();
    }

    public String getWelcomeTitle()
    {
        return welcomeText.getText();
    }
}
