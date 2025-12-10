package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MoreDropdownnLinkPage {
    private WebDriver driver;
    WebDriverWait wait;

    public MoreDropdownnLinkPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickValidationPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#\\32 "))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#more-68 > li:nth-child(14) > a"))).click();
    }
}
