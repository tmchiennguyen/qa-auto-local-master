package pages;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/12/2015.
 */
public class KeyPressPage {
    By Text=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By Result=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/p[@id='result']");

    public boolean LoadKeyPressPage(WebDriver driver){
        return find_element(driver, Text).getText().equals("Key Presses");
    }

    public void Check_TextIpnut(WebDriver driver) throws AWTException, InterruptedException {
        Thread.sleep(3000);
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_A);
        rb.keyRelease(KeyEvent.VK_A);
    }
}
