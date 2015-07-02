package auto;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.FileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;

import static support.Helpers.find_element;

/**
 * Created by nancy.nguyen on 6/17/2015.
 */
public class Form_Auto {
//    RemoteWebElement driver;
//    public LocalFileDetector detector=new LocalFileDetector();
//    protected Logger logger = Logger.getLogger(this.getClass().getName() + "],[" + driver);

    By FirstName=By.xpath("//*[@id='content']/form/fieldset/div[1]/p[3]/input");
    By LastName=By.xpath("//*[@id='content']/form/fieldset/div[1]/p[4]/input");
    By Male=By.xpath("//*[@id='sex-0']");
    By FeMale=By.xpath("//*[@id='sex-1']");
    By Option1=By.xpath("//*[@id='exp-0']");
    By Option2=By.xpath("//*[@id='exp-1']");
    By Option3=By.xpath("//*[@id='exp-2']");
    By Option4=By.xpath("//*[@id='exp-3']");
    By Option5=By.xpath("//*[@id='exp-4']");
    By Option6=By.xpath("//*[@id='exp-5']");
    By Option7=By.xpath("//*[@id='exp-6']");
    By Date=By.xpath("//*[@id='datepicker']");
    By ManualTest=By.xpath("//*[@id='profession-0']");
    By AutoTest=By.xpath("//*[@id='profession-1']");
    By UpLoad=By.xpath("//*[@id='profession-1']");
    By DownLoad=By.xpath("//*[@id='content']/form/fieldset/div[8]/a");
    By QTP=By.xpath("//*[@id='tool-0']");
    By SeleniumIDE=By.xpath("//*[@id='tool-1']");
    By SeleniumWebDriver=By.xpath("//*[@id='tool-2']");
    By Combobox1=By.xpath("//*[@id='continents']");
    By Combobox2=By.xpath("//*[@id='selenium_commands']");

    public void Input_Text(WebDriver driver, By local, String text){
        find_element(driver, local).sendKeys(text);
    }

    public void Choose_Radio(WebDriver driver, By local){
        find_element(driver, local).click();
    }

    public void Select_Checkbox(WebDriver driver, By local){
        find_element(driver, local).click();
    }

    public void Run_Test(WebDriver driver){
        Input_Text(driver, FirstName, "NguyenNguyen");
        Input_Text(driver, LastName, "123456789");
        Choose_Radio(driver, FeMale);
        Choose_Radio(driver, Option3);
        Input_Text(driver, Date, "11.1.2010");
        Select_Checkbox(driver, ManualTest);
        Select_Checkbox(driver, AutoTest);
        Select_Checkbox(driver, QTP);
        Select_Checkbox(driver, SeleniumWebDriver);
    }

//    public void uploadFile(WebElement element, String fileName) throws Exception {
//        File upOne = new File(System.getProperty("user.dir"));
//        String filePath = (upOne + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + fileName);
//        File file = detector.getLocalFile(filePath);
//        ((RemoteWebElement)element).setFileDetector(detector);
//
//        if (file.exists()){
//            element.sendKeys(filePath);
//            logger.info(" Adding File path: " + filePath);
//        } else {
//            logger.error("File not found path: " + filePath);
//        }
//    }

//    public void Download_File(WebDriver driver, By local, String link){
//        find_element(driver, local).click();
//
//    }
}
