package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class WebTables extends Methods {
    By add = By.id("addNewRecordButton");
    By searchBox = By.id("searchBox");
    By clickSearch = By.id("basic-addon2");
    By row = By.xpath("//div[@class = 'rt-tr-group']");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By age = By.id("age");
    By salary = By.id("salary");
    By department = By.id("department");
    By submit = By.id("submit");

    public WebTables(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void clickAdd(){
        click(add);
    }
    public void search(String s){
        sendKeys(searchBox, s);
    }
    public void clickSearch(){
        click(clickSearch);
    }
    public WebElement getRow(int index){
        return getRows().get(index);
    }
    public List<WebElement> getRows(){
        List<WebElement> rows = new ArrayList<>();
        for(WebElement e : elements(row)){
            if(e.getText().isBlank()){
                continue;
            }
            else{
                rows.add(e);
            }
        }
        return rows;
    }
    public String[] information(int index){
        return getRow(index).getText().split("\n");
    }
    public String getName(int index){
        return information(index)[0];
    }
    public String getLastName(int index){
        return information(index)[1];
    }
    public String getAge(int index){
        return information(index)[2];
    }
    public String getEmail(int index){
        return information(index)[3];
    }
    public String getSalary(int index){
        return information(index)[4];
    }
    public String getDepartment(int index){
        return information(index)[5];
    }
    public void clickEdit(int index){
        driver.findElement(By.id(String.format("edit-record-%d", index + 1))).click();
    }
    public void sendFirstName(String s){
        sendKeys(firstName, s);
    }
    public void sendLastName(String s){
        sendKeys(lastName, s);
    }
    public void sendEmail(String s){
        sendKeys(email, s);
    }
    public void sendAge(String s){
        sendKeys(age, s);
    }
    public void sendSalary(String s){
        sendKeys(salary, s);
    }
    public void sendDepartment(String s){
        sendKeys(department, s);
    }
    public void clearFirstName(){
        element(firstName).clear();
    }
    public void clearLastName(){
        element(lastName).clear();
    }
    public void clearEmail(){
        element(email).clear();
    }
    public void clearAge(){
        element(age).clear();
    }
    public void clearSalary(){
        element(salary).clear();
    }
    public void clearDepartment(){
        element(department).clear();
    }


    public void clickSubmit(){
        click(submit);
    }
    public void deleteRecord(int index){
        driver.findElement(By.id(String.format("delete-record-%d", index + 1))).click();
    }
}
