package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/15/2015.
 */
public class DataTables {
       public void Find_Data(WebDriver driver, String FirstName){
        for(int i=1; i<3; i++)
            for (int j = 1; j < 5; j++) {
                String xpath_tb = "//*[@id='table" + i + "']/tbody/tr[" + j + "]";
                By local= By.xpath(xpath_tb+"/td[2]");
                if(find_element(driver, local).getText().equals("Jason")){
                    String result="";
                    for(int x=1; x<7;x++) {
                        result += find_element(driver, By.xpath(xpath_tb + "/td[" + x + "]")).getText() +", ";
                    }
                    System.out.println(result);
                }
       }
    }
}
