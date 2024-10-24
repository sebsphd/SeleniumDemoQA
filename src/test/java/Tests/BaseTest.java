package Tests;

import Pages.ElementsPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected MainPage mainPage;
//    protected ElementsPage elementsPage;

    @BeforeClass
    public void initialize(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ianti/OneDrive/Documents/dev/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        mainPage = new MainPage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
