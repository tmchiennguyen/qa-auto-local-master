package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class DynamicControlsPage {
    By DynamicControlsText=By.xpath("/html/body/div[2]/div/div/h4");
    By DynamicControlsButton=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/form/button[@id='btn']");
    By DynamicControlsCheckbox=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/form/button[@id='btn']");

    public boolean LoadDynamicControlsPage(WebDriver driver){
        return find_element(driver, DynamicControlsText).getText().equals("Dynamic Controls");
    }

    public void Click_Button(WebDriver driver){
        find_element(driver, DynamicControlsButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().back();
    }


}
