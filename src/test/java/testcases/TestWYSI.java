package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/29/2015.
 */
public class TestWYSI extends SetupTest {
    @Test
    public void test_EditComment(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);

    }
}
