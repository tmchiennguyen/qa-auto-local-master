package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/29/2015.
 */
public class UploadPage {
    By Upload=By.id("file-upload");
    By Submit=By.id("file-submit");

    public void UploadFile(WebDriver driver) throws AWTException {
        find_element(driver, Upload).click();

        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_D);
        rb.keyRelease(KeyEvent.VK_D);

        rb.keyPress(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SHIFT);

        rb.keyPress(KeyEvent.VK_BACK_SLASH);
        rb.keyRelease(KeyEvent.VK_BACK_SLASH);

        rb.keyPress(KeyEvent.VK_A);
        rb.keyRelease(KeyEvent.VK_A);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        find_element(driver, Submit).click();
    }
}
