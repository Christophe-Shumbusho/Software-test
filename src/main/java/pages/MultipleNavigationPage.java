package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MultipleNavigationPage {
    private WebDriver driver;
    WebDriverWait wait;
    public MultipleNavigationPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void clickNavigationPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='https://www.bcs.org/']"))).click();

    }
}
