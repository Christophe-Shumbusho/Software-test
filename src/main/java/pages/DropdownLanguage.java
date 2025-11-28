package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownLanguage {
    private WebDriver driver;
    private By dropdown = By.cssSelector("#\\38  > div > svg > path");
    //WebElement dropdownElement = driver.findElement(dropdown);
    public DropdownLanguage(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromCountry(String text){
            findDropDownCountry().selectByVisibleText(text);
        }
        public List<String> getSelectedCountry(){
            List<WebElement> selectedElements = findDropDownCountry().getAllSelectedOptions();
            return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
        }

        public  Select findDropDownCountry(){
            return new Select(driver.findElement(dropdown));
        }
    }

