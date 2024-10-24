package Tests.Elements;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class CheckBox extends BaseTest {

    @Test
    public void checkHome(){
        var elementPage = mainPage.clickElements();
        var checkboxPage = elementPage.clickCheckBoxPage();
//        elementsPage.clickElementsComponent("Check Box");
    }
}
