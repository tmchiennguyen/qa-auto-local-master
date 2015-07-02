package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.CheckBoxes;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class TestCheckBoxes extends SetupTest {
    @Test
    public void test_CheckBoxes(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoCheckboxes(driver);

        CheckBoxes checkBoxes=new CheckBoxes();
        checkBoxes.LoadCheckBoxesPage(driver);
        checkBoxes.Check_Box(driver);
//        checkBoxes.UnCheck_Box(driver);
    }
}
