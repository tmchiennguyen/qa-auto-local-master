package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/11/2015.
 */
public class ForgotPasswordPage {
    By ForgotPassText= By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/h2");
    By EmailWhere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/form[@id='forgot_password']/div[@class='row']/div[@class='large-6 small-12 columns']/input[@id='email']");
    By ResendButtonWhere=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/div[@class='example']/form[@id='forgot_password']/button[@id='form_submit']/i[@class='icon-2x icon-signin']");
    String email="nguyen@gmail.com";

    public boolean LoadForgotPasswordPage(WebDriver driver){
        return find_element(driver,ForgotPassText).getText().equals("Forgot Password");
    }

    public void Input_Email(WebDriver driver){
        find_element(driver, EmailWhere).sendKeys(email);
        find_element(driver, ResendButtonWhere).click();
        driver.navigate().back();
    }


}
