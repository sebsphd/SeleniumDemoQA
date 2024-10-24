package Tests.Elements;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseTest {
    private WebDriver driver;

    @Test
    public void clickRadioButton(){
        var elementPage = mainPage.clickElements();
        var radioButtonPage = elementPage.clickRadioButtonPage();
        radioButtonPage.clickYes();
        Assert.assertEquals(radioButtonPage.getYesText(),"Yes");
        radioButtonPage.clickImpressive();
        Assert.assertEquals(radioButtonPage.getImpressiveText(),"Impressive");
    }
}
