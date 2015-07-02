package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class CheckBoxes {
    By checkBoxesText= By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By checkBoxesWhere=By.tagName("input");
    public boolean LoadCheckBoxesPage(WebDriver driver){
        return find_element(driver, checkBoxesText).getText().equals("Checkboxes");
    }

    public void Check_Box(WebDriver driver) {
        WebElement el = find_element(driver, checkBoxesWhere);
        if (!el.isSelected()) el.click();
        driver.navigate().back();
    }

    public void UnCheck_Box(WebDriver driver){
        WebElement el=find_element(driver, checkBoxesWhere);
        if(el.isSelected()) el.click();
    }
}
