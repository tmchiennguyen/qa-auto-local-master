package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.DisappearingElementsPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class TestDisappearingElement extends SetupTest {
    @Test
    public void test_DisappearingElement(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoDisappearingElement(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        DisappearingElementsPage disappearingElementsPage=new DisappearingElementsPage();
        disappearingElementsPage.LoadDisappearingElementsPage(driver);
        disappearingElementsPage.Click_About(driver);
        disappearingElementsPage.Click_ContactUs(driver);
        disappearingElementsPage.Click_Protfolio(driver);
        disappearingElementsPage.Click_Home(driver);
    }

}
