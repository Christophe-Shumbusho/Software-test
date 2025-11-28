package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
//

public class DropdownCountriesTest extends BaseTest {
    @Test
    public void testDropdown(){
    var dropdownPage = homePage.clickHome();
    String text = "Bristol";
    dropdownPage.selectFromCountry(text);
    var selectedOptions = dropdownPage.getSelectedCountry();
        Assert.assertEquals(selectedOptions.size(),1, "Incorrect number of selections");


    }

}
