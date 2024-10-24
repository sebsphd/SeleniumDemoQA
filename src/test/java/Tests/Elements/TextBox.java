package Tests.Elements;

import Pages.ElementsPage;
import Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TextBox extends BaseTest {

    @Test
    public void fillTextBox(){
        var elementsPage = mainPage.clickElements();
        var textBoxPage = elementsPage.clickTextBoxPage();
        textBoxPage.fillFullName("Acrobatic Warrior");
        textBoxPage.fillEmail("AcrobaticNanans@fullblack.com");
        textBoxPage.fillAddress("7th Avenue of Moriarty");
        textBoxPage.fillPermanentAddress("Nothing");
        textBoxPage.clickSubmitButton();
    }
}
