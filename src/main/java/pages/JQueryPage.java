package pages;
import java.awt.Robot;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ENTER;
import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class JQueryPage {
    By Text=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By Enable=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='description']/ul[@id='menu']/li[@class='ui-menu-item']/a[@id='ui-id-2']");
    By Downloads=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='description']/ul[@id='menu']/li[@class='ui-menu-item']/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][1]/a[@id='ui-id-4']");
    By BackTo=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='description']/ul[@id='menu']/li[@class='ui-menu-item']/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][2]/a[@id='ui-id-5']");
    By PDF=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='description']/ul[@id='menu']/li[@class='ui-menu-item']/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][1]/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][1]/a[@id='ui-id-6']");
    By CSV=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='description']/ul[@id='menu']/li[@class='ui-menu-item']/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][1]/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][2]/a[@id='ui-id-7']");
    By Excel=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='description']/ul[@id='menu']/li[@class='ui-menu-item']/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][1]/ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[@class='ui-menu-item'][3]/a[@id='ui-id-8']");
    By Disable=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='description']/ul[@id='menu']/li[@class='ui-state-disabled ui-menu-item']/a[@id='ui-id-1']");
    public boolean LoadJQueryPage(WebDriver driver){
        return find_element(driver,Text).getText().equals("JQueryUI - Menu");
    }

    public void BackToJQuery(WebDriver driver){
        Actions acts=new Actions(driver);
        acts.moveToElement(find_element(driver, Enable));
        acts.moveToElement(find_element(driver, BackTo)).click().perform();
    }

    public void Download_PDF(WebDriver driver) throws InterruptedException, AWTException {
        Actions acts=new Actions(driver);
        acts.moveToElement(find_element(driver, Enable));
        acts.moveToElement(find_element(driver, Downloads));
        acts.moveToElement(find_element(driver, PDF)).click().perform();

        Thread.sleep(3000);
        Robot rb= new Robot();
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    public void Download_CSV(WebDriver driver) throws InterruptedException, AWTException {
        Actions acts=new Actions(driver);
        acts.moveToElement(find_element(driver, Enable));
        acts.moveToElement(find_element(driver, Downloads));
        acts.moveToElement(find_element(driver, CSV)).click().perform();

        Thread.sleep(3000);
        Robot rb= new Robot();
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    public void Download_Excel(WebDriver driver) throws InterruptedException, AWTException {
        Actions acts=new Actions(driver);
        acts.moveToElement(find_element(driver, Enable));
        acts.moveToElement(find_element(driver, Downloads));
        acts.moveToElement(find_element(driver, Excel)).click().perform();

        Thread.sleep(3000);
        Robot rb= new Robot();
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
}
