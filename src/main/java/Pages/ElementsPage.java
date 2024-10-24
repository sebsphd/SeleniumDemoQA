package Pages;

import Pages.Elements.CheckBoxPage;
import Pages.Elements.RadioButtonPage;
import Pages.Elements.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.text.Element;

public class ElementsPage {
    private WebDriver driver;
    private By textBox = By.id("item-0");

    public ElementsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTextBox(){
        driver.findElement(textBox).click();
    }

//    public TextBoxPage clickElementsComponent(String component){
//        driver.findElement(By.id(component)).click();
//        return new TextBoxPage(driver);
//    }

    public TextBoxPage clickTextBoxPage(){
        clickComponent("item-0");
        return new TextBoxPage(driver);
    }

    public CheckBoxPage clickCheckBoxPage(){
        clickComponent("item-1");
        return new CheckBoxPage(driver);
    }

    public RadioButtonPage clickRadioButtonPage(){
        clickComponent("item-2");
        return new RadioButtonPage(driver);
    }
    private void clickComponent(String id){
        driver.findElement(By.id(id)).click();
    }
}
