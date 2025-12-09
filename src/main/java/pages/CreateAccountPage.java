package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void setFirstName(String firstName){
        driver.findElement(By.name("nameFirst")).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        driver.findElement(By.name("nameLast")).sendKeys(lastName);
    }
    public void setEmail(String email){
        driver.findElement(By.name("email")).sendKeys(email);
    }
    public void setPhoneNumber(String phoneNumber){
        driver.findElement(By.name("phone")).sendKeys(phoneNumber);
    }
    public void clickCreateButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-ux='ButtonPrimary']"))).click();
    }
    public String getSuccessMessage() {
        By messageLocator = By.cssSelector("p[data-aid='CREATE_ACCOUNT_DESCRIPTION_REND']");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(messageLocator)).getText();
    }
}
