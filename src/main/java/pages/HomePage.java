package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 6/4/2015.
 */
public class HomePage {
    By homePageTitle = By.xpath("//*[@id='content']/h1");
    String homePageTxt = "Welcome to the Internet";


    By abTesting=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[1]/a");
    By basicAuthRef = By.xpath("//*[@id='content']/ul/li[2]/a");
    By brokenImages=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[3]/a");
    By challengingDOM=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[4]/a");
    By checkboxes=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[5]/a");
    By contextMenu=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[6]/a");
    By disappearingElements=By.xpath("/html/body/div[2]/div/ul/li[7]/a");
    By dragAndDrop=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[8]/a");
    By dropDown=By.xpath("/html/body/div[2]/div/ul/li[9]/a");
    By dynamicContent=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[10]/a");
    By dynamicControls=By.xpath("/html/body/div[2]/div/ul/li[11]/a");
    By dynamicLoading=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[11]/a");
    By fileDownload=By.xpath("//*[@id='content']/ul/li[13]/a");
    By fileUpload=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[14]/a");
    By forgotPassword=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[15]/a");
    By fromAuthentication=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[16]/a");
    By frames=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[17]/a");
    By hovers=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[19]/a");
    By jqueryIU=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[20]/a");
    By alert=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[21]/a");
    By keyPress=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[23]/a");
    By multiWindow=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[25]/a");
    By dataTable=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[32]/a");
    By editor=By.xpath("/html[@class='no-js']/body/div[@class='row'][2]/div[@id='content']/ul/li[35]/a");

    By loginPageRef = By.xpath("//*[@id='content']/ul/li[16]/a");
    By geoLocationRef = By.xpath("//*[@id='content']/ul/li[18]/a");


    public boolean homePageLoaded (WebDriver driver){
        return find_element(driver, homePageTitle).getText().equals(homePageTxt);
    }

    public void gotoABTesting(WebDriver driver) {find_element(driver, abTesting).click();}

    public void gotoCheckboxes(WebDriver driver){find_element(driver, checkboxes).click();}

    public void gotoContextMenu(WebDriver driver){find_element(driver, contextMenu).click(); }

    public void gotoDisappearingElement(WebDriver driver){find_element(driver, disappearingElements).click();}

    public void gotoDragAndDrop(WebDriver driver){find_element(driver, dragAndDrop).click();}

    public void gotoDropDown(WebDriver driver){find_element(driver, dropDown).click(); }

    public void gotoDynamicContent(WebDriver driver){find_element(driver, dynamicContent).click();}

    public void gotoDynamicControls(WebDriver driver){find_element(driver, dynamicControls).click();}

    public void gotoDynamicLoading(WebDriver driver){find_element(driver, dynamicLoading).click();}

    public void gotoFileDownload(WebDriver driver){find_element(driver, fileDownload).click();}

    public void gotoFileUpload(WebDriver driver){find_element(driver, fileUpload).click();}

    public void gotoForgotPassword(WebDriver driver){find_element(driver, forgotPassword).click();}

    public void gotoAuthenticationPage(WebDriver driver){find_element(driver, fromAuthentication).click();}

    public void gotoFrames(WebDriver driver){find_element(driver, frames).click();}

    public void gotoHovers(WebDriver driver){find_element(driver, hovers).click();}

    public void gotoJQuery(WebDriver driver){find_element(driver, jqueryIU).click();}

    public void gotoAlert(WebDriver driver){find_element(driver, alert).click();}

    public void gotoKeyPress(WebDriver driver){find_element(driver, keyPress).click();}

    public void gotoMultiWindow(WebDriver driver){find_element(driver, multiWindow).click();}

    public void gotoDataTable(WebDriver driver){find_element(driver, dataTable).click();}

    public void gotoEditor(WebDriver driver){find_element(driver,editor ).click();}

    public void gotoLoginPage (WebDriver driver){
        find_element(driver, loginPageRef).click();
    }

    public void gotoBasicAuthPage (WebDriver driver){
        find_element(driver, basicAuthRef).click();
    }

    public void gotoGeolocationPage (WebDriver driver){
        find_element(driver, geoLocationRef).click();
    }
}
