package waits;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Wait extends BaseTest {

        @Test
        public void testWaitsUntilHidden(){
            homePage.removePopUp();
            var loadingPage = homePage.clickSignIn();
            loadingPage.clicksignInButton();

        }
    }

