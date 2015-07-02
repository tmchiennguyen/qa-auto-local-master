package testcaseAuto;

import auto.Form_Auto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by nancy.nguyen on 6/17/2015.
 */
public class TestFormAuto {
    public static WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver=new FirefoxDriver();
        driver.get("http://www.toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void test_Upload(){
        Form_Auto form_auto=new Form_Auto();
        form_auto.Run_Test(driver);
//        By local= By.xpath("//*[@id='photo']");
//
//        Form_Auto form_auto=new Form_Auto();
//        form_auto.Upload_Image(driver,local,"10847885_408227429350429_7740591796051106799_n");
    }
    @AfterMethod
    public void End(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.quit();
    }

}
