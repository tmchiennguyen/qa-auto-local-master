package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UploadPage;

import java.awt.*;

/**
 * Created by nancy.nguyen on 6/29/2015.
 */
public class TestUploadFile extends SetupTest {
    @Test
    public void test_UploadFile() throws AWTException {
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoFileUpload(driver);

        UploadPage uploadPage=new UploadPage();
        uploadPage.UploadFile(driver);
    }
}
