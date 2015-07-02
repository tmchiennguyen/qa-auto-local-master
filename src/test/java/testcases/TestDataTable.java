package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.DataTables;
import pages.HomePage;

/**
 * Created by nancy.nguyen on 6/15/2015.
 */
public class TestDataTable extends SetupTest {
    @Test
    public void test_DataTable() {
        HomePage homePage=new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoDataTable(driver);

        DataTables dataTables=new DataTables();
        dataTables.Find_Data(driver, "Jason");
    }
}
