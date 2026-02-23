package Alert;

import base.BaseTest;
import org.testng.annotations.Test;

public class testAlert extends BaseTest {
    @Test
    public void testAlertPage(){
       var AlertPage = homePage.clickAlert();
       AlertPage.alert_clickToDismiss();
    }
}
