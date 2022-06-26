package Pages.Forms;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PracticeForm extends Methods {
    By name = By.id("firstName");
    By lastName = By.id("lastName");
    By eMail =By.id("userEmail");
    By male = By.id("gender-radio-1");
    By female = By.id("gender-radio-2");
    By other = By.id("gender-radio-3");
    By mobile = By.id("userNumber");
    By date = By.id("dateOfBirthInput");
    By subject = By.cssSelector(".subjects-auto-complete__control.css-yk16xz-control");
    By hobies = By.id("hobbies-checkbox-1");
    By reading = By.id("hobbies-checkbox-2");
    By music = By.id("hobbies-checkbox-3");
    By upload = By.id("uploadPicture");
    By currentAddress = By.id("currentAddress");
    By state = By.xpath("//div[@class=' css-yk16xz-control']//div[@class=' css-1hwfws3']");
    By city = By.xpath("(//div[@class='col-md-4 col-sm-12'])[2]");
    By submit = By.id("submit");
    By month = By.className("react-datepicker__month-select");
    By year = By.className("react-datepicker__year-select");
    By row = By.tagName("tr");

    public PracticeForm(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }
    public void inputFirstName(String s){
        sendKeys(name, s);
    }
    public String getFirstNameValue(){
        return element(name).getAttribute("value");
    }
    public void inputLastName(String s){
        sendKeys(lastName, s);
    }
    public String getLastName(){
        return element(lastName).getAttribute("value");
    }
    public void inputEmail(String s){
        sendKeys(eMail, s);
    }
    public String getEmail(){
        return element(eMail).getAttribute("value");
    }
    public void clickGender(int s){
        driver.findElement(By.cssSelector(String.format("label[for='gender-radio-%d']", s))).click();
    }
    public void inputMobile(String s){
        sendKeys(mobile, s);
    }
    public String getMobile(){
        return element(mobile).getAttribute("value");
    }
    public void datePick(String d, int m, String y){
        click(date);
        Select selectMonth = new Select(element(month));
        selectMonth.selectByIndex(m - 1);
        Select selectYear = new Select(element(year));
        selectYear.selectByValue(y);
        click(By.xpath(String.format("(//div[text()='%s'])[1]", d)));
    }
    public String dateValue(){
        return element(date).getAttribute("value");
    }
    public void inputSubject(String s){
        actions.click(element(subject)).sendKeys(s).sendKeys(Keys.TAB).build().perform();
    }
    public String getInputSubject(){
        return element(subject).getAttribute("value");
    }
    public void clickHobbies(int d){
        click(By.cssSelector(String.format("label[for='hobbies-checkbox-%d']", d)));
    }
    public void uploadFile() throws IOException {
        WebElement ChoseFile = element(upload);
        Path tempFile = Files.createTempFile("tempFile",".tmp");
        String fileName = tempFile.toAbsolutePath().toString();
        ChoseFile.sendKeys(fileName);
    }
    public void inputCurrentAddress(String s){
        sendKeys(currentAddress, s);
    }
    public String getInputAdress(){
        return element(currentAddress).getAttribute("value");
    }
    public void clickSubmit(){
        actions.sendKeys(Keys.ENTER).build().perform();
    }
    public void selectCityState(){
       actions.click(element(By.xpath("//div[@id='state']//div[contains(@class,'css-yk16xz-control')]"))).sendKeys("NCR").sendKeys(Keys.ENTER).build().perform();
       actions.click(element(By.xpath("//div[@id='city']//div[contains(@class,'css-1hwfws3')]"))).sendKeys("Delhi").sendKeys(Keys.ENTER).build().perform();
    }
    public List<String> getRows(){
        List<WebElement>li = elements(row);
        List<String>li1 = new ArrayList<>();
        for(WebElement e : li){
            li1.add(e.getText());
        }
        return li1;
    }
    public List<String>initalList(){
        List<String> li = new ArrayList<>();
        li.add("Label Values");
        li.add("Student Name Ivan Ivanovic");
        li.add("Student Email ivan@gmail.com");
        li.add("Gender Male");
        li.add("Mobile 3463634564");
        li.add("Date of Birth 12 February,1995");
        li.add("Subjects English");
        li.add("Hobbies Reading");
        li.add("Picture");
        li.add("Address Some adress 112 street");
        li.add("State and City NCR Delhi");
        return li;
    }
}
