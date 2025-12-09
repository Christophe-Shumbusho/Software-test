package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownCountriesTest extends BaseTest {
    @Test
    public void testDropdownSelection() {
        DropdownPage dropdownPage = new DropdownPage(driver);

        dropdownPage.selectFromCountry("Bristol"); // Select the country
        List<String> selected = dropdownPage.getSelectedCountry(); // Get selected value

        Assert.assertTrue(selected.contains("Bristol"), "Dropdown did not select the expected country!");
    }
}
