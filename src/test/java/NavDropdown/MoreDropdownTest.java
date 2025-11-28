package NavDropdown;

import base.BaseTest;
import org.testng.annotations.Test;

public class MoreDropdownTest extends BaseTest {
    @Test
    public void testMoreDrop(){
        homePage.removePopUp();
        var navMorePage = homePage.navMoreOptions();
    }
}
