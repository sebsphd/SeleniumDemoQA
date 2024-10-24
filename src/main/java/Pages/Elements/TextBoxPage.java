package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {
    private WebDriver driver;
    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By addressField = By.id("currentAddress");
    private By permAddressField = By.id("permanentAddress");
    private By submitBtn = By.id("submit");

    public TextBoxPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillFullName(String fullName){
        driver.findElement(fullNameField).sendKeys(fullName);
    }

    public void fillEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }

    public void fillPermanentAddress(String permanentAddress){
        driver.findElement(permAddressField).sendKeys(permanentAddress);
    }

    public void clickSubmitButton(){
        driver.findElement(submitBtn).click();
    }
}
