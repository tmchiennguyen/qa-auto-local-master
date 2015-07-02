package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KeyPressPage;

import java.awt.*;

/**
 * Created by nancy.nguyen on 6/12/2015.
 */
public class TestKeyPress extends SetupTest {
    @Test
    public void test_KeyPress() throws AWTException, InterruptedException {
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoKeyPress(driver);;

        KeyPressPage keyPressPage=new KeyPressPage();
//        keyPressPage.LoadKeyPressPage(driver);
        keyPressPage.Check_TextIpnut(driver);

    }
}
