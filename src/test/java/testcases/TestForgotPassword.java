package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class TestForgotPassword extends SetupTest {
    @Test
    public void test_ForgotPassword(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoForgotPassword(driver);

        ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();
        forgotPasswordPage.LoadForgotPasswordPage(driver);
        forgotPasswordPage.Input_Email(driver);

    }
}
