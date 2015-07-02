package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JQueryPage;

import java.awt.*;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class TestJQuery extends SetupTest{
    @Test
    public void Test_Load(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoJQuery(driver);

        JQueryPage jQueryPage=new JQueryPage();
        jQueryPage.LoadJQueryPage(driver);
    }

    @Test
    public void Test_Backto(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoJQuery(driver);

        JQueryPage jQueryPage=new JQueryPage();
        jQueryPage.BackToJQuery(driver);
    }

    @Test
    public void test_DownloadPDF() throws AWTException, InterruptedException {
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoJQuery(driver);

        JQueryPage jQueryPage=new JQueryPage();
        jQueryPage.Download_PDF(driver);
    }

    @Test
    public void test_DownloadCSV() throws AWTException, InterruptedException {
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoJQuery(driver);

        JQueryPage jQueryPage=new JQueryPage();
        jQueryPage.Download_CSV(driver);
    }

    @Test
    public void test_DownloadExcel() throws AWTException, InterruptedException {
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoJQuery(driver);

        JQueryPage jQueryPage=new JQueryPage();
        jQueryPage.Download_Excel(driver);
    }

}
