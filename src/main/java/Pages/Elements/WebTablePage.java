package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage {
    private WebDriver driver;
    private By addBtn = By.id("addNewRecordButton");
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By emailField = By.id("userEmail");
    private By ageField = By.id("age");
    private By salaryField = By.id("salary");
    private By departmentField = By.id("department");
    private By submitBtn = By.id("submit");


    public WebTablePage(WebDriver driver){
        this.driver = driver;
    }

    public void addData(){
        driver.findElement(addBtn).click();
    }

    public void fillFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void fillEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillAge(String age){
        driver.findElement(ageField).sendKeys(age);
    }

    public void fillSalary(String salary){
        driver.findElement(salaryField).sendKeys(salary);
    }

    public void fillDepartment(String department){
        driver.findElement(departmentField).sendKeys(department);
    }

    public void clickSubmit(){
        driver.findElement(submitBtn).click();
    }

    public void deleteData(String dataId){
        driver.findElement(By.id(dataId)).click();
    }

    public void editData(String dataId){
        driver.findElement(By.id(dataId)).click();
    }
}
