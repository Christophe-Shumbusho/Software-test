package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By popup = By.cssSelector("#popup-widget183-close-icon");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }
    public void removePopUp(){
        driver.findElement(popup).click();
    }
    public JoinUsPage clickJoinUs(){
        clickLink("JOIN US");
        return new JoinUsPage(driver);
    }
    public CreateAccountPage clickCreateAccount(){
        clickLink("Create account.");
        return new CreateAccountPage(driver);
    }
    public DropdownLanguage clickHome(){
        removePopUp();
        return new DropdownLanguage(driver);
    }
    public LoginPage clickSignIn(){
        clickLink("JOIN US");
        return new LoginPage(driver);
    }
    public MoreDropdownLink navMoreOptions(){
        driver.findElement(By.cssSelector("#\\32 ")).click();
        driver.findElement(By.cssSelector("#more-68 > li:nth-child(14) > a")).click();
        return new MoreDropdownLink(driver);
    }
    public BritishComputerSocietyPage clickBritishPage(){
        clickLink("British Computer Society");
        return new BritishComputerSocietyPage(driver);
    }
}
