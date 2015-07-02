package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MultiWindowsPage;

/**
 * Created by nancy.nguyen on 6/15/2015.
 */
public class TestMultiWindow extends SetupTest{
    @Test
    public void test_MultilWindow(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoMultiWindow(driver);

        MultiWindowsPage multiWindowsPage=new MultiWindowsPage();
        multiWindowsPage.Click_Multi(driver);
    }
}
