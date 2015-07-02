package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/12/2015.
 */
public class AlertPage {
    By Text=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By AlertButton=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[1]/button");
    By ConfirmButton=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[2]/button");
    By PromptButton=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[3]/button");
    By Result=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/p[@id='result']");

    public boolean LoadAlertPage(WebDriver driver){
        return find_element(driver, Text).getText().equals("JavaScript Alerts");
    }

    public void Click_Alert(WebDriver driver){
        String results="";

        find_element(driver, AlertButton).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        results=find_element(driver, Result).getText();
        System.out.println(results);

        find_element(driver, ConfirmButton).click();
        alert.accept();
        results=find_element(driver, Result).getText();
        System.out.println(results);

        find_element(driver, ConfirmButton).click();
        alert.dismiss();
        results=find_element(driver, Result).getText();
        System.out.println(results);

        find_element(driver, PromptButton).click();
        alert.sendKeys("Hello World");
        alert.accept();
        results=find_element(driver, Result).getText();
        System.out.println(results);

        find_element(driver, PromptButton).click();
        alert.dismiss();
        results=find_element(driver, Result).getText();
        System.out.println(results);
    }

    public void Click_Confirm(WebDriver driver){
        find_element(driver, ConfirmButton).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
