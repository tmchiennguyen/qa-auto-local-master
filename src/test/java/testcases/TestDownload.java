package testcases;

import Utils.SetupTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DownloadPage;
import pages.HomePage;

import java.awt.*;
import java.io.IOException;

/**
 * Created by nancy.nguyen on 6/29/2015.
 */
public class TestDownload extends SetupTest {
    @Test
    public void test_Dowload() throws IOException, AWTException, InterruptedException {
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoFileDownload(driver);

        DownloadPage downloadPage=new DownloadPage();
        downloadPage.Download_file1(driver);
    }
}