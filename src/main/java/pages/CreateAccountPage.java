package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;
    private By firstNameInputField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(1) > input ");
    private By secondNameInputField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(2) > input");
    private By emailInputField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(3) > input");
    private By phoneInputField = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(4) > input");
    private By createAccountButton = By.cssSelector("#bs-6 > span > div > div > div > form > div:nth-child(6) > button");
    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }
    public void setFirstName(String firstName){
        driver.findElement(firstNameInputField).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        driver.findElement(secondNameInputField).sendKeys(lastName);
    }
    public void setEmail(String email){
        driver.findElement(emailInputField).sendKeys(email);
    }
    public void setPhoneNumber(String phoneNumber){
        driver.findElement(phoneInputField).sendKeys(phoneNumber);
    }
    public void clickCreateButton(){
        driver.findElement(createAccountButton).click();
    }
}
