package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.ABTestingPage;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class TestABTesting extends SetupTest {
    @Test
    public void test_ABTestingPage(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoABTesting(driver);

        ABTestingPage abTestingPage=new ABTestingPage();
        abTestingPage.LoadABTestingPage(driver);
        driver.navigate().back();
    }
}
