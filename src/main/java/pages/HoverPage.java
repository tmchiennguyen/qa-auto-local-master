package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class HoverPage {
    By HoveText=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By Image1=By.xpath("//*[@id=\"content\"]/div/div[1]/img");
    By View1=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='figure'][1]/div[@class='figcaption']/a");

    By Image2=By.xpath("//*[@id=\"content\"]/div/div[2]/img");
    By View2=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='figure'][2]/div[@class='figcaption']/a");

    By Image3=By.xpath("//*[@id=\"content\"]/div/div[3]/img");
    By View3=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/div[@class='figure'][3]/div[@class='figcaption']/a");

    public boolean LoadHoverPage(WebDriver driver){
        return find_element(driver, HoveText).getText().equals("Hovers");
    }

    public void View_Image1(WebDriver driver){
        Actions actions=new Actions(driver);
        actions.moveToElement(find_element(driver, Image1));
        actions.moveToElement(find_element(driver, View1)).click().perform();
        System.out.println("View 1 ok !!!");
        driver.navigate().back();
    }
    public void View_Image2(WebDriver driver){
        Actions actions=new Actions(driver);
        actions.moveToElement(find_element(driver, Image2));
        actions.moveToElement(find_element(driver, View2)).click().perform();
        System.out.println("View 2 ok !!!");
        driver.navigate().back();
    }
    public void View_Image3(WebDriver driver){
        Actions actions=new Actions(driver);
        actions.moveToElement(find_element(driver, Image3));
        actions.moveToElement(find_element(driver, View3)).click().perform();
        System.out.println("View 3 ok !!!");
        driver.navigate().back();
    }
}
