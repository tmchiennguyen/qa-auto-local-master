package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.xml.ws.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import static support.Helpers.find_element;
/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class ContextMenuPage {
    By ContextMenuText= By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By BoxWhere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@id='hot-spot']");
    By linkOpen=By.linkText("the-internet");
    public boolean LoadContextMenuPage(WebDriver driver){
        return find_element(driver, ContextMenuText).getText().equals("Context Menu");
    }

    public void Right_Click(WebDriver driver){
        WebElement el=find_element(driver, BoxWhere);
        Actions action=new Actions(driver);
        action.contextClick(el).build().perform();
        driver.navigate().back();
//        find_element(driver, linkOpen).click();

    }
}
