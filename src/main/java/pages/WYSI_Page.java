package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/29/2015.
 */
public class WYSI_Page {
    By File= By.id("mceu_15-open");
    By NewDoc=By.id("mceu_33-text");

    public void Edit(WebDriver driver){
        find_element(driver, File).click();
        find_element(driver, NewDoc).click();
    }
}
