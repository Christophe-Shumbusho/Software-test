package NavDropdown;

import base.BaseTest;
import org.testng.annotations.Test;

public class MoreDropdownnTest extends BaseTest {
    @Test
    public void testMoreDrop(){
        var navMorePage = homePage.clickMore();
        navMorePage.clickValidationPage();
    }
}
