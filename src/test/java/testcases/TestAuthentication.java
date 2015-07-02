package testcases;

import Utils.SetupTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.HomePage;

import java.security.PublicKey;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class TestAuthentication extends SetupTest {
    @Test
    public void test_Login(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoAuthenticationPage(driver);

        AuthenticationPage authenticationPage=new AuthenticationPage();
        authenticationPage.LoadAuthenticationPage(driver);
        authenticationPage.Login(driver);
        authenticationPage.Logout(driver);
    }
}

