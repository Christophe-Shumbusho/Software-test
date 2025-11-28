package join;

import base.BaseTest;
import org.testng.annotations.Test;

public class JoinUsTest extends BaseTest {
    @Test
    public void testJoinUs(){
         homePage.removePopUp();
         var joinPage = homePage.clickJoinUs();
    }
}
