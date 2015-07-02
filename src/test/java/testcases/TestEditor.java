package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.EditorPage;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/15/2015.
 */
public class TestEditor extends SetupTest {
    @Test
    public void test_NewDocument(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoEditor(driver);

        EditorPage editorPage=new EditorPage();
        editorPage.New_Document(driver);
    }
}
