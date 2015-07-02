package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/12/2015.
 */
public class TestAlert extends SetupTest {
    @Test
    public void test_Alert(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoAlert(driver);

        AlertPage alertPage=new AlertPage();
        alertPage.LoadAlertPage(driver);
        alertPage.Click_Alert(driver);
//        alertPage.Click_Confirm(driver);
    }
}
