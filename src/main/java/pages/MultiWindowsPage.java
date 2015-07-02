package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/12/2015.
 */
public class MultiWindowsPage {

    By ClickHere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/a");
//    public boolean LoadPage(){
//        return true;
//    }

    public void Click_Multi(WebDriver driver){
        String parentWindow=driver.getWindowHandle();
        find_element(driver, ClickHere).click();

        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
//        String a=driver.findElement(By.xpath("/html/body/div[@class='example']/h3")).getText();
//        System.out.println(a);
        driver.close();
        driver.switchTo().window(parentWindow);
    }

}
