package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class TestFrames extends SetupTest {
    @Test
    public void test_Frame(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoFrames(driver);

        FramesPage framesPage=new FramesPage();
//        framesPage.LoadFramesPage(driver);
//        framesPage.Click_Nested(driver);
        framesPage.Click_iFrames(driver);
    }
}
