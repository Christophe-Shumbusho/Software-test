package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By iframeLocator = By.cssSelector("iframe[srcdoc]");
    private By dropdownLocator = By.id("tCounty");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToIframe() {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(iframeLocator));
        driver.switchTo().frame(iframe);
    }

    public void scrollToDropdown() {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
    }

    public void selectFromCountry(String countryName) {
        switchToIframe(); // Step 1: enter iframe
        scrollToDropdown(); // Step 2: scroll to dropdown

        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
        Select select = new Select(dropdown);
        select.selectByVisibleText(countryName);

        driver.switchTo().defaultContent(); // Step 3: exit iframe
    }

    public List<String> getSelectedCountry() {
        switchToIframe();
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
        Select select = new Select(dropdown);
        List<String> selected = select.getAllSelectedOptions()
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        driver.switchTo().defaultContent();
        return selected;
    }
}

