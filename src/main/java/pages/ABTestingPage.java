package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class ABTestingPage {
    By abText=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    public boolean LoadABTestingPage(WebDriver driver) {
        return find_element(driver, abText ).getText().equals("A/B Test Control");
    }
}
