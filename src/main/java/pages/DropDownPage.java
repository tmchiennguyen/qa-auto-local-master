package pages;


import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.security.PublicKey;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class DropDownPage {
    By DropDownText=By.xpath("/html/body/div[2]/div/div/h3");
    By DropDownWhere=By.id("dropdown");

    public boolean LoadDropDownPage(WebDriver driver) {
        return find_element(driver, DropDownText).getText().equals("Dropdown List");
    }

    public void ChooseDropDownList(WebDriver driver){
        Select dropdown=new Select(find_element(driver, DropDownWhere));
        dropdown.selectByIndex(1);
        driver.navigate().back();
    }

}
