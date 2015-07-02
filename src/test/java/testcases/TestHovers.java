package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverPage;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class TestHovers extends SetupTest {
    @Test
    public void test_Hover(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoHovers(driver);

        HoverPage hoverPage=new HoverPage();
        hoverPage.LoadHoverPage(driver);
        hoverPage.View_Image1(driver);
        hoverPage.View_Image2(driver);
        hoverPage.View_Image3(driver);
    }
}
