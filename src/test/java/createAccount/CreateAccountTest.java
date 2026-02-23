package createAccount;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {
    @Test
    public void testCreateAccount(){
        var createAccount = homePage.clickCreateAccount();
        createAccount.setFirstName("Christophe");
        createAccount.setLastName("Shumbusho");
        createAccount.setEmail("christopheshumbusho69@gmail.com");
        createAccount.setPhoneNumber("0792452911");
        createAccount.clickCreateButton();

        String success = createAccount.getSuccessMessage();
        //System.out.println(success);

        Assert.assertTrue(success.contains("By creating an account"),
                "success message was not found");


  }
}
