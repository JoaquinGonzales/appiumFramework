package Pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[@index=6]")
    private WebElement loginButton;

    private List<AndroidElement> elements ;


    public LoginPage() throws MalformedURLException {
    }

    private void init()
    {
        elements = androidDriver.findElementsByXPath("//android.widget.EditText[@index='0']");
    }
    public void enterUsername(String userName)
    {
        init();
        elements.get(0).sendKeys(userName);
    }

    public void enterPassword(String password)
    {
        elements.get(1).sendKeys(password);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public void filloutFields(String username, String password)
    {
        init();
        elements.get(0).sendKeys(username);
        elements.get(1).sendKeys(password);
    }
    public void login(String username, String password)
    {
        enterUsername(username);
        enterPassword(password);
        loginButton.click();
    }



}
