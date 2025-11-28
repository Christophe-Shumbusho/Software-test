package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(1) > input");
    private By passwordField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(2) > input");
    private By signInButton = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(5) > button");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clicksignInButton(){
        driver.findElement(signInButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
}
