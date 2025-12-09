package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    private By popup = By.cssSelector("#popup-widget183-close-icon");
    @BeforeClass
    public void  setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://candymapper.com/");
        System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void removePopUp(){
        driver.findElement(popup).click();
    }

//    @AfterClass
//    public void tearDown(){
//     driver.quit();
//    }



}

