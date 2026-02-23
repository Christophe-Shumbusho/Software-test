package pages;

import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    public AlertPage(WebDriver driver){
        this.driver = driver;
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
}
