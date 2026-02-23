package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
     WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }

    public JoinUsPage clickJoinUs(){
        clickLink("JOIN US");
        return new JoinUsPage(driver);
    }

    public CreateAccountPage clickCreateAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("JOIN US"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create account."))).click();
        return new CreateAccountPage(driver);
    }

    public DropdownPage clickHome(){
        return new DropdownPage(driver);
    }
    public LoginPage clickSignIn(){
        clickLink("JOIN US");
        return new LoginPage(driver);
    }
    public MoreDropdownnLinkPage clickMore(){
        return new MoreDropdownnLinkPage(driver);
    }
    public MultipleNavigationPage clickNavPage(){
        return new MultipleNavigationPage(driver);
    }
    public AlertPage clickAlert(){
        driver.findElement(By.linkText("+44 20 7946 0")).click();
        return new AlertPage(driver);
    }
}
