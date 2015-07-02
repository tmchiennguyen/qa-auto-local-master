package pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Logger;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class DownloadPage {
    By DownloadText= By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By Download1Where=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/a[1]");

//    By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/a[2]");

    private static Logger log=Logger.getLogger(Log.class.getName());
    public boolean LoadDownloadPage(WebDriver driver){
        return find_element(driver, DownloadText).getText().equals("File Downloader");
    }
    public void Download_file1(WebDriver driver) throws IOException, AWTException, InterruptedException {
        find_element(driver, Download1Where).click();
        Thread.sleep(3000);
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

}
