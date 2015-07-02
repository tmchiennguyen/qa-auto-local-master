package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class TestDropDown extends SetupTest {
    @Test
    public void test_DropDown(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoDropDown(driver);

        DropDownPage dropDownPage=new DropDownPage();
        dropDownPage.LoadDropDownPage(driver);
        dropDownPage.ChooseDropDownList(driver);
    }

}
