package Pages;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.testng.Assert.*;

public class HomePageTest {

    @Test
    public void testClickLoginLink() throws MalformedURLException {
        HomePage page = new HomePage();
        page.clickLoginLink();
    }
}