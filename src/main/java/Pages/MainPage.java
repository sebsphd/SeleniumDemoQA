package Pages;

import Pages.Elements.CheckBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.reporters.jq.Main;

public class MainPage {
    private WebDriver driver;
    private By elementsBtn = By.xpath("//h5[text()='Elements']");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public ElementsPage clickElements(){
        driver.findElement(elementsBtn).click();
        return new ElementsPage(driver);
    }
}
