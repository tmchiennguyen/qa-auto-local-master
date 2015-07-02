package pages;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/15/2015.
 */
public class EditorPage {
    By Edit_Btn=By.xpath("//*[@id='mceu_15-open']/span");
    By New_Btn=By.id("mceu_33");
    By Text_Local = By.xpath("//*[@id='tinymce']");

    public void New_Document(WebDriver driver){
        find_element(driver, Edit_Btn).click();
        Actions act=new Actions(driver);
        act.clickAndHold(find_element(driver, Edit_Btn)).moveToElement(find_element(driver, New_Btn)).release().click().perform();
//        find_element(driver, New_Btn).click();
//        find_element(driver, Edit_Btn).sendKeys("asdaskjdhaksjhdka");
    }
}
