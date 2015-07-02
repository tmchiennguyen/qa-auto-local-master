package testcases;

import Utils.SetupTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class TestDynamicControls extends SetupTest {
    @Test
    public void test_DynamicControls(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoDynamicControls(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        DynamicControlsPage dynamicControlsPage=new DynamicControlsPage();
        dynamicControlsPage.LoadDynamicControlsPage(driver);
        dynamicControlsPage.Click_Button(driver);

    }
}
