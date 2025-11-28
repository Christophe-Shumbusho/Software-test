package login;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin(){
        homePage.removePopUp();
        var loginPage = homePage.clickSignIn();
        loginPage.setEmailField("christopheshumbusho69@gmail.com");
        loginPage.setPasswordField("christophe");
        loginPage.clicksignInButton();
    }
}
