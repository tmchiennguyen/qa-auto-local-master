package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/10/2015.
 */
public class TestDragAndDrop extends SetupTest {
    @Test
    public void test_DragAndDrop(){
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoDragAndDrop(driver);

        DragAndDropPage dragAndDropPage=new DragAndDropPage();
        dragAndDropPage.LoadDragAndDropPage(driver);
        dragAndDropPage.GetDragAndDrop(driver);
    }

}
