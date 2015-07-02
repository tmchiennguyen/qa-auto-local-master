package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class TestContextMenu extends SetupTest{
    @Test
    public void test_ContextMenu(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoContextMenu(driver);

        ContextMenuPage contextMenu=new ContextMenuPage();
        contextMenu.LoadContextMenuPage(driver);
        contextMenu.Right_Click(driver);

    }

}
