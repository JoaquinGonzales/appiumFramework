package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.offset.PointOption.point;


public class SettingsPage extends BasePage {

    @FindBy(id = "com.snappii_corp.osha_case_reporting:id/user_email")
    private WebElement userEmail;

    public SettingsPage() throws MalformedURLException {
    }

    public String returnEmailUserLogged()
    {
        return userEmail.getText();
    }

    public void swipeDown()
    {
        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));").click();

//        try{
//            TouchAction action = new TouchAction(androidDriver);
//            action.press(point(10,100));
//            action.moveTo(point(10,10));
//            action.release();
//            action.perform();
//            System.out.println("Swipe down was Successfully done");
//        }
//        catch (Exception e)
//        {
//            System.out.println("swipe was not sucessfully");
//        }
    }

    public void clickOnLogOutButton()
    {
        WebElement logOutIcon = androidDriver.findElement(By.id("com.snappii_corp.osha_case_reporting:id/design_menu_item_text"));
        logOutIcon.click();
    }
}
