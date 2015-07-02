package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class DisappearingElementsPage {
    By DisappearingText= By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h3");
    By HomeWhere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[1]/a");
    By AboutWhere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[2]/a");
    By ContactUsWhere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[3]/a");
    By PortfolioWhere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/ul/li[4]/a");

    public boolean LoadDisappearingElementsPage(WebDriver driver){
        return find_element(driver,DisappearingText).getText().equals("Disappearing Elements");
    }

    public void Click_Home(WebDriver driver){
        find_element(driver, HomeWhere).click();
        driver.navigate().back();
    }

    public void Click_About(WebDriver driver){
        find_element(driver, AboutWhere).click();
        driver.navigate().back();
    }

    public void Click_ContactUs(WebDriver driver){
        find_element(driver, ContactUsWhere).click();
        driver.navigate().back();
    }

    public void Click_Protfolio(WebDriver driver){
        find_element(driver, PortfolioWhere).click();
        driver.navigate().back();
    }
}
