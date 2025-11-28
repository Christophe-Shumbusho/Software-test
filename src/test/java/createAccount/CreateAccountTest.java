package createAccount;

import base.BaseTest;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {
    @Test
    public void testCreateAccount(){
        homePage.removePopUp();
        var joinpage = homePage.clickJoinUs();
        var createAccount = homePage.clickCreateAccount();
        createAccount.setFirstName("Christophe");
        createAccount.setLastName("Shumbusho");
        createAccount.setEmail("christopheshumbusho69@gmail.com");
        createAccount.setPhoneNumber("0792452911");
        createAccount.clickCreateButton();

    }
}
