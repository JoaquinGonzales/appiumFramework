package Components;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;

public class CommonEvents {

    public static WebElement scrollDownUntilEditableElement(String text) throws MalformedURLException {
        return AndroidDriverManager.getInstance().findElementByAndroidUIAutomator
                ("new UiScrollable(new UiSelector().className(\"android.widget.EditText\")).scrollIntoView(text(\""+text+"\"));");
    }

    public static void swipeAction() throws MalformedURLException {

       TouchAction action = new TouchAction(AndroidDriverManager.getInstance());
       PointOption pX = new PointOption();
       pX.withCoordinates(1024,980);
       PointOption pY = new PointOption();
       pY.withCoordinates(550,980);

       action.press(pX).moveTo(pY).waitAction(waitOptions(ofSeconds(1))).release().perform();
    }

    public static WebElement findByContainsText(String name) throws MalformedURLException {
        return AndroidDriverManager.getInstance().findElementByAndroidUIAutomator
                ("new UiSelector().className(\"android.widget.EditText\").textContains(\""+name+"\")");
    }
}

