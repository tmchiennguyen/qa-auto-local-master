package pages;

import com.oracle.webservices.internal.api.databinding.Databinding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class DragAndDropPage {
    By DragText=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By FirstWhere=By.xpath("/html/body/div[2]/div/div/div/div[1]");
    By EndWhere = By.xpath("/html/body/div[2]/div/div/div/div[2]");

    public boolean LoadDragAndDropPage(WebDriver driver){
        return find_element(driver, DragText).getText().equals("Drag and Drop");
    }

    public void GetDragAndDrop(WebDriver driver){

        WebElement From = find_element(driver, FirstWhere);
        WebElement To=find_element(driver, EndWhere);

        Actions actions=new Actions(driver);

//        Action DragAndDrop=actions.clickAndHold(From).moveToElement(To).release(To).build();
        Action DragAndDrop=actions.dragAndDrop(From, To).build();
        DragAndDrop.perform();
//        driver.navigate().back();
    }
}
