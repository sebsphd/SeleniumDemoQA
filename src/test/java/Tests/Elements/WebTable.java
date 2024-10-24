package Tests.Elements;

import Pages.Elements.WebTablePage;
import Pages.ElementsPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

public class WebTable extends BaseTest {




    @Test
    public void addTableData(){
        var elementPage = mainPage.clickElements();
        var webTablePage = elementPage.clickWebTablePage();
        webTablePage.addData();
        webTablePage.fillFirstName("Nanz");
        webTablePage.fillLastName("dark lord");
        webTablePage.fillEmail("Nanzdadarklord@blackingbar.com");
        webTablePage.fillAge("23");
        webTablePage.fillSalary("12000000");
        webTablePage.fillDepartment("Support Dept.");
        webTablePage.clickSubmit();
    }

    @Test
    public void removeData(){
        var elementPage = mainPage.clickElements();
        var webTablePage = elementPage.clickWebTablePage();
        webTablePage.deleteData("delete-record-2");
    }

    @Test
    public void changeData(){
        var elementPage = mainPage.clickElements();
        var webTablePage = elementPage.clickWebTablePage();
        webTablePage.editData("edit-record-2");
        webTablePage.fillFirstName("EDITED NAME");
        webTablePage.clickSubmit();
    }
}
