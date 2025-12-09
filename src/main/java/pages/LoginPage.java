package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    WebDriverWait wait;
    public LoginPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    }
    public void setEmailField(String email){

        driver.findElement(By.name("email")).sendKeys(email);
    }
    public void setPasswordField(String password){

        driver.findElement(By.name("password")).sendKeys(password);
    }
    public void clickSignInButton(){
        driver.findElement(By.cssSelector("button[data-ux-btn ='primary']")).click();
    }

    public String getSuccessMessage() {
        By messageLocator = By.cssSelector("h1[role ='heading']");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(messageLocator)).getText();
    }
}
