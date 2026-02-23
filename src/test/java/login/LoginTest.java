package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin(){
        var loginPage = homePage.clickSignIn();
        loginPage.setEmailField("christopheshumbusho69@gmail.com");
        loginPage.setPasswordField("christophe");
        loginPage.clickSignInButton();
        String success = loginPage.getSuccessMessage();

        Assert.assertEquals(success,"Account Login");

    }
}
