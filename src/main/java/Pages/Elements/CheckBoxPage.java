package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    private WebDriver driver;
    private By homeBox = By.className("rct-icon rct-icon-uncheck");
    private By resultText = By.id("result");
    private By expandHome = By.className("rct-icon rct-icon-expand-close");


    public CheckBoxPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHomeBox(){
        driver.findElement(homeBox).click();
        driver.findElement(resultText).isDisplayed();
    }

    public void expandHomeBox(){
        driver.findElement(expandHome).click();
    }

}
