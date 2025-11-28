package British;

import base.BaseTest;
import org.testng.annotations.Test;

public class BritishComputerSocietyTest extends BaseTest {
    @Test
    public void testBritish(){
        homePage.removePopUp();
        var britishPage = homePage.clickBritishPage();
    }

}
