package WindowNavigation;

import base.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class MultipleNavPage extends BaseTest {
    @Test
    public void testWindowNavigation(){
        var navPage = homePage.clickNavigationPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement body = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.tagName("body")
        ));

        Assert.assertTrue(body.isDisplayed(), "Body is not visible!");

    }
}
