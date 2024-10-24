package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioButtonPage {
    private WebDriver driver;
    private By radioYes = By.cssSelector("label[for='yesRadio']");
    private By radioImpressive = By.cssSelector("label[for='impressiveRadio']");

    public RadioButtonPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickYes(){
        driver.findElement(radioYes).click();
    }

    public void clickImpressive(){
        driver.findElement(radioImpressive).click();
    }

    public String getYesText(){
        return driver.findElement(By.className("text-success")).getText();
    }

    public String getImpressiveText(){
        return driver.findElement(By.className("text-success")).getText();
    }
}
