package Pages;

import Components.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


public abstract class BasePage {
    private AndroidDriver androidDriver;

    public BasePage() throws MalformedURLException {
        androidDriver = AndroidDriverManager.getInstance();
        PageFactory.initElements(androidDriver,this);
    }
}

