package Components;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverManager {

    protected static AndroidDriver adriver = null;

    private AndroidDriverManager() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","8.0.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"M4V5T18505004303");
        // desiredCapabilities.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        desiredCapabilities.setCapability("appPackage","com.snappii_corp.osha_case_reporting");
        desiredCapabilities.setCapability("appActivity","com.store2phone.snappii.ui.activities.StartActivity");
        adriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        adriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static AndroidDriver getInstance() throws MalformedURLException {
        if (adriver == null)
        {
           new AndroidDriverManager();
        }
        return adriver;
    }

}
