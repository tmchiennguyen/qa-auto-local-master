package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class FramesPage {
    By FramesText=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By Nested=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[1]/a");
    By iFrames=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[2]/a");
    By iText=By.id("mce_0_ifr");

    public boolean LoadFramesPage(WebDriver driver){
        return find_element(driver, FramesText).getText().equals("Frames");
    }

    public void Click_Nested(WebDriver driver){
        find_element(driver, Nested).click();
        driver.navigate().back();
    }

    public void Click_iFrames(WebDriver driver){
        find_element(driver, iFrames).click();
//        find_element(driver, iText).click();
//        find_element(driver, iText).sendKeys("Hello World !!!");
        driver.navigate().back();
    }
}
