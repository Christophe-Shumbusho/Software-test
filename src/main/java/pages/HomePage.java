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
    public MoreDropdownnLink navMoreOptions(){
        driver.findElement(By.cssSelector("#\\32 ")).click();
        driver.findElement(By.cssSelector("#more-68 > li:nth-child(14) > a")).click();
        return new MoreDropdownnLink(driver);
    }
    public MultipleNavigationPage clickNavigationPage(){
        WebElement navPageLink = driver.findElement(By.cssSelector("a[href='https://www.bcs.org/']"));
        navPageLink.click();
        return new MultipleNavigationPage(driver);
    }
}
