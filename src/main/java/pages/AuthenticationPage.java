package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class AuthenticationPage {
    By AuthenticationText=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h2");
    By UserName=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/form[@id='login']/div[@class='row'][1]/div[@class='large-6 small-12 columns']/input[@id='username']");
    By PassWord=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/form[@id='login']/div[@class='row'][2]/div[@class='large-6 small-12 columns']/input[@id='password']");
    By ButtonLogin=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/form[@id='login']/button[@class='radius']");
    By ButtonLogout=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/a[@class='button secondary radius']");

    public boolean LoadAuthenticationPage(WebDriver driver){
        return find_element(driver, AuthenticationText).getText().equals("Login Page");
    }

    public void Login(WebDriver driver){
        find_element(driver, UserName).sendKeys("tomsmith");
        find_element(driver, PassWord).sendKeys("SuperSecretPassword!");
        find_element(driver, ButtonLogin).click();
        System.out.println("Login Successful");
    }

    public void Logout(WebDriver driver){
        find_element(driver, ButtonLogout).click();
        System.out.println("Logout Successful");
    }
}
