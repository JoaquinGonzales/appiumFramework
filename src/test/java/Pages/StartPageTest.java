package Pages;

import Components.CommonEvents;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class StartPageTest {
    private StartPage page = new StartPage();
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    private SettingsPage settingsPage = new SettingsPage();

    public StartPageTest() throws MalformedURLException {
    }

    @Test
    public void testClickLoginLink() {
        page.clickLoginLink();
    }

    @Test
    public void loginUsingValidCredentials()
    {
        page.clickLoginLink();
        loginPage.login("joaquinjqn2@gmail.com","defenseoftheancient");
    }

    @Test
    public void getDate()
    {
        System.out.println("teh actual Date"+ CommonEvents.getActualDate());
        page.getWelcomeTitle();
    }

    @Test void clickOnSettingsIcon()
    {
        String username = "joaquinjqn2@gmail.com";
        page.clickLoginLink();
        loginPage.login(username,"defenseoftheancient");
        homePage.clickOnSettingsIcon();
        String actualResult = settingsPage.returnEmailUserLogged();

        Assert.assertEquals(actualResult, username);
    }

}